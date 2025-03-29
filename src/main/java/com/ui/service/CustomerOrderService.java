package com.ui.service;
import com.ui.model.CustomerOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class CustomerOrderService {

    private Logger logger= LoggerFactory.getLogger(CustomerOrderService.class);
    public CustomerOrderService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate= jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;

    public List<CustomerOrder> callCustomerOrderFunc(int empId) {
        String sql = "{? = call customer_order_proc(?)}"; // Updated function call with RETURN parameter

        return jdbcTemplate.execute((ConnectionCallback<List<CustomerOrder>>) connection -> {
            // Prepare callable statement
            CallableStatement cs = connection.prepareCall(sql);

            // Set input parameter (empid)
            cs.setInt(2, empId);

            // Register the output parameter for the REFCURSOR (this is the first parameter)
            cs.registerOutParameter(1, Types.REF_CURSOR);

            // Execute the function
            cs.execute();

            // Get the result set from the REFCURSOR (output parameter 1)
            ResultSet resultSet = (ResultSet) cs.getObject(1);

            // Process the result set and map to a list of CustomerOrder objects
            List<CustomerOrder> orders = new ArrayList<>();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("employee_id");
                BigDecimal salary = resultSet.getBigDecimal("salary");
                int orderId = resultSet.getInt("order_id");
                Timestamp orderDate = resultSet.getTimestamp("order_date");
                String shipName = resultSet.getString("shipp_name");

                // Create CustomerOrder object and add to the list
                CustomerOrder order = new CustomerOrder(employeeId, salary, orderId, orderDate, shipName);
                orders.add(order);
            }

            return orders;
        });
    }

//    // Call PostgreSQL function and process the REF CURSOR
//    public List<CustomerOrder> callCustomerOrderFunc(int empId) {
//        String sql = "{? = call customer_order_proc(?)}"; // PostgreSQL function call
//
//        return jdbcTemplate.execute((ConnectionCallback<List<CustomerOrder>>) connection -> {
//            // Prepare callable statement
//            CallableStatement cs;
//            cs = connection.prepareCall(sql);
//            cs.setInt(2, empId); // Set empid parameter
//
//            // Register REF cursor
//            cs.registerOutParameter(1, Types.REF_CURSOR);
//
//            // Execute the function
//            cs.execute();
//
//            // Get the result set from the REF cursor
//            ResultSet resultSet = (ResultSet) cs.getObject(1);
//
//            // Process the result set and map to a list of CustomerOrder objects
//            List<CustomerOrder> orders = new ArrayList<>();
//            while (resultSet.next()) {
//                int employeeId = resultSet.getInt("employee_id");
//                BigDecimal salary = resultSet.getBigDecimal("salary");
//                int orderId = resultSet.getInt("order_id");
//                Timestamp orderDate = resultSet.getTimestamp("order_date");
//                String shipName = resultSet.getString("shipp_name");
//
//                // Create CustomerOrder object and add to the list
//                CustomerOrder order = new CustomerOrder(employeeId, salary, orderId, orderDate, shipName);
//                orders.add(order);
//            }
//
//            return orders;
//        });
//    }


//    public void callCustomerOrderFunc(int empId) {
//        // Creating callable statement for the stored procedure
//        String sql = "{call customer_order_proc(?)}"; // Call the function with parameter
//
//        jdbcTemplate.execute(connection -> {
//            CallableStatement cs;
//            cs = connection.prepareCall(sql);
//            cs.setInt(1, empId); // Set the empid parameter
//
//            // Register the REF cursor
//            cs.registerOutParameter(2, Types.REF_CURSOR);
//            cs.execute();
//
//            // Get the result (the cursor)
//            ResultSet resultSet = (ResultSet) cs.getObject(2);
//            while (resultSet.next()) {
//                // Assuming you want to process the result, here you can map it to an object or log it
//                int employeeId = resultSet.getInt("employee_id");
//                double salary = resultSet.getDouble("salary");
//                int orderId = resultSet.getInt("order_id");
//                Date orderDate = resultSet.getDate("order_date");
//                String shipName = resultSet.getString("shipp_name");
//
//                logger.info("Employee ID: " + employeeId + ", Salary: " + salary +
//                        ", Order ID: " + orderId + ", Order Date: " + orderDate + ", Shipping Name: " + shipName);
//            }
//            return null; // We do not need to return any result here
//        });
//    }
}