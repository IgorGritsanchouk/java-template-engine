package com.ui.service;

import com.ui.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;
import com.ui.model.Customer;
import java.sql.*;

@Service
public class CustomerService {

    private final Logger logger= LoggerFactory.getLogger(CustomerService.class);
    private CustomerRepository customerRepository;

    public CustomerService(JdbcTemplate jdbcTemplate, CustomerRepository customerRepository){
        this.jdbcTemplate= jdbcTemplate;
        this.customerRepository= customerRepository;
    }
    //@Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Customer customer){
        Customer result= this.customerRepository.save(customer);
        logger.info("CustomerService saved customer id: "+ result.getCustomerId()+" name: "+ result.getContactName());
    }



    // Method to call the function that returns a cursor
    public void fetchCustomers() {
       //String sql = "SELECT get_customers_cursor()";  // Call the function that returns a cursor
        String sql ="{? = call get_customers_cursor()}";

        jdbcTemplate.execute((ConnectionCallback<Object>) connection -> {
            // Prepare the callable statement for the function
            CallableStatement callableStatement;
            callableStatement = connection.prepareCall(sql);

            callableStatement.registerOutParameter(1, Types.REF_CURSOR);

            // Execute the function
            callableStatement.execute();

            // Retrieve the result set (cursor) from the callable statement
            ResultSet resultSet = (ResultSet) callableStatement.getObject(1);

            // Process the result set
            while (resultSet.next()) {
                Long id = resultSet.getLong("customer_id");
                String companyName = resultSet.getString("company_name");
                String contactName = resultSet.getString("contact_name");
                String phone = resultSet.getString("phone");

                // Process the data (e.g., print to console)
                System.out.println("ID: " + id + ", companyName: " + companyName + ", contactName: " + contactName+", phone: " + phone);
            }

            return null;
        });
    }
}
