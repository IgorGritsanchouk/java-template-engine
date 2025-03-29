package com.ui.repository.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.ui.model.CustomerOrder;

import java.util.List;

@Repository
public class CustomerOrderRep {

    private final JdbcTemplate jdbcTemplate;

    private final Logger logger= LoggerFactory.getLogger(CustomerOrderRep.class);

    //@Autowired
    public CustomerOrderRep(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<CustomerOrder> selectCustomerOrder(Long p_employee_id) {
//        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
//                //.withProcedureName("get_users_by_country")
//                .withFunctionName("get_users_by_country")
//                .useInParameterNames(countryName)
//                .returningResultSet("users", BeanPropertyRowMapper.newInstance(User.class));
//
//        Map<String, Object> result = simpleJdbcCall.execute();
//  to do
//        SELECT e.employee_id, e.salary, o.order_id, o.order_date, o.shipp_name
//        FROM employees e
//        INNER JOIN orders o ON o.employee_id = e.employee_id AND o.customer_id = c.customer_id
//        WHERE e.employee_id = 1;

//        String sql = SELECT e.employee_id, e.salary, o.order_id, o.order_date, o.shipp_name, c.customer_id, c.company_name, c.phone
//        FROM employees e
//        INNER JOIN orders o ON o.employee_id = e.employee_id
//        INNER JOIN customers c ON o.customer_id = c.customer_id
//        WHERE e.employee_id = p_employee_id;

        String sql = "SELECT * FROM public.customer_order_proc(1)";

        //String sql = "SELECT * FROM public.get_users_by_country('"+p_country_name+"')";
        BeanPropertyRowMapper rowMapper = BeanPropertyRowMapper.newInstance(com.ui.model.CustomerOrder.class);
        List<CustomerOrder> customerOrders = jdbcTemplate.query(sql, rowMapper);

        //customerOrders.forEach(country -> logger.info("{}", country));
        logger.info("customer orders num: "+ customerOrders.size()+ "  employee id:"+ p_employee_id);

        return customerOrders;
    }

}
