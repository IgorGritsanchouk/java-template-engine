package com.ui.service;

import com.ui.model.EmployeeOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Service
public class EmployeeOrderService {

    private final Logger logger= LoggerFactory.getLogger(EmployeeOrderService.class);

    public EmployeeOrderService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate= jdbcTemplate;
    }

    private final JdbcTemplate jdbcTemplate;

    public List<EmployeeOrder> getEmployeeOrders(int empid) {
        // SQL to call the PostgreSQL function
        String sql = "SELECT * FROM get_employee_orders(?)";

        // Use jdbcTemplate to query the database
        return jdbcTemplate.query(sql, new Object[]{empid}, new ResultSetExtractor<List<EmployeeOrder>>() {
            @Override
            public List<EmployeeOrder> extractData(ResultSet rs) throws SQLException {
                List<EmployeeOrder> employeeOrderList = new ArrayList<>();
                while (rs.next()) {
                    EmployeeOrder employeeOrder = new EmployeeOrder();
                    employeeOrder.setEmployeeId(rs.getLong("employee_id"));
                    employeeOrder.setFirstName(rs.getString("first_name"));
                    employeeOrder.setLastName(rs.getString("last_name"));
                    employeeOrder.setMobilePhone(rs.getLong("mobile_phone"));
                    // order info
                    employeeOrder.setOrderId(rs.getLong("order_id"));
                    employeeOrder.setOrderDate(rs.getTimestamp("order_date"));
                    employeeOrder.setOrderStatus(rs.getString("order_status"));
                    employeeOrder.setTrackingNumber(rs.getString("tracking_number"));
                    //  customer info
                    employeeOrder.setCustomerId(rs.getLong("customer_id"));
                    employeeOrder.setCompanyName(rs.getString("company_name"));
                    employeeOrder.setPhone(rs.getString("phone"));

                    employeeOrderList.add(employeeOrder);
                }
                return employeeOrderList;
            }
        });
    }

    public List<EmployeeOrder> getEmployeeOrderCsr(int empid) throws SQLException, ClassNotFoundException{

        List<EmployeeOrder> result= new ArrayList<EmployeeOrder>();

        Class.forName("org.postgresql.Driver");

        //String url = "jdbc:postgresql://localhost:5432/postgres_db?user=admin&password&ssl=true";
        String url = "jdbc:postgresql://localhost:5432/postgres_db?user=admin&password&ssl=false";
        Properties props = new Properties();
        props.setProperty("user", "admin");
        props.setProperty("password", "password");
        props.setProperty("ssl","false");
        Connection conn = DriverManager.getConnection(url, props);


        CallableStatement func = conn.prepareCall("{? = call employee_order_func(?) }");
        func.registerOutParameter(1, Types.OTHER);
        func.setInt(2,empid);
        func.execute();
        ResultSet results = (ResultSet) func.getObject(1);
        while (results.next()) {
            EmployeeOrder eo= new EmployeeOrder();
            System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
            // do something with the results.
            result.add(eo);
        }
        results.close();
        func.close();

        return result;
    }

    public List<EmployeeOrder> getEmployeeOrderLst(int empid) {

        String sql = "{? = call employee_order_func(?)}";

        // Use JdbcTemplate.call() to execute the function and retrieve the REF cursor
        return jdbcTemplate.execute((CallableStatementCreator) connection -> {
            CallableStatement cs = connection.prepareCall(sql);
            // Register the OUT parameter (cursor)
            cs.registerOutParameter(1, java.sql.Types.REF_CURSOR);
            cs.setInt(2, empid);
            return cs;
        }, (CallableStatementCallback<List<EmployeeOrder>>) cs -> {
            // Execute the function
            cs.execute();

            // Get the REF cursor result
            ResultSet rs = (ResultSet) cs.getObject(1);
            List<EmployeeOrder> employeeOrderLst = new ArrayList<>();

            // Process the result set
            while (rs.next()) {
                EmployeeOrder employeeOrder = new EmployeeOrder();
                employeeOrder.setEmployeeId(rs.getLong("employee_id"));
                employeeOrder.setFirstName(rs.getString("first_name"));
                employeeOrder.setLastName(rs.getString("last_name"));
                employeeOrder.setMobilePhone(rs.getLong("mobile_phone"));
                employeeOrder.setOrderId(rs.getLong("order_id"));
                employeeOrder.setOrderDate(rs.getTimestamp("order_date"));
                employeeOrder.setOrderStatus(rs.getString("order_status"));
                employeeOrder.setTrackingNumber(rs.getString("tracking_number"));
                employeeOrderLst.add(employeeOrder);
            }

            return employeeOrderLst;
        });
    }




//    public List<EmployeeOrder> getEmployeeOrderLst(int empid) {
//        // Create a SQL query to call the PostgreSQL function
//        //String sql = "SELECT * FROM employee_order_func(?)";
//        String sql= "{? = call employee_order_func(?) }";
//
//        // Execute the query and retrieve the cursor
//        return jdbcTemplate.query(sql, new Object[]{empid}, new ResultSetExtractor<List<EmployeeOrder>>() {
//        //return jdbcTemplate.query(sql, new ResultSetExtractor<List<EmployeeOrder>>() {
//            @Override
//            public List<EmployeeOrder> extractData(ResultSet rs) throws SQLException {
//                List<EmployeeOrder> employeeOrderLst = new ArrayList<>();
//
//                // Iterate through the result set and map it to your EmployeeOrder object
//                while (rs.next()) {
//                    // Assume your Customer class has a constructor or setters to handle the result
//                    EmployeeOrder employeeOrder = new EmployeeOrder();
//
//                    employeeOrder.setEmployeeId(rs.getLong("employee_id"));
//                    employeeOrder.setFirstName(rs.getString("first_name"));
//                    employeeOrder.setLastName(rs.getString("last_name"));
//                    employeeOrder.setMobilePhone(rs.getLong("mobile_phone"));
//                    employeeOrder.setOrderId(rs.getLong("order_id"));
//                    employeeOrder.setOrderDate(rs.getTimestamp("order_date"));
//                    employeeOrder.setShippName(rs.getString("shipp_name"));
//                    employeeOrder.setTrackingNumber(rs.getString("tracking_number"));
//
//                    employeeOrderLst.add(employeeOrder);
//                }
//
//                return employeeOrderLst;
//            }
//        });
//    }

}
