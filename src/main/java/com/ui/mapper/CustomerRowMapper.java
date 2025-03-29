package com.ui.mapper;
import com.ui.model.Customer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
public class CustomerRowMapper implements RowMapper<Customer>{

    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

        Customer customer = new Customer();
        customer.setCustomerId(rs.getLong("customer_id"));
        customer.setCompanyName(rs.getString("company_name"));
        customer.setContactName(rs.getString("contact_name"));
        customer.setContactTitle(rs.getString("contact_title"));
        customer.setAddress(rs.getString("address"));
        customer.setCity(rs.getString("city"));
        customer.setRegion(rs.getString("region"));
        customer.setPostalCode(rs.getString("postal_code"));
        customer.setCountry(rs.getString("country"));
        customer.setPhone(rs.getString("phone"));
        customer.setCreatedAt(rs.getTimestamp("created_at"));

        return customer;
    }
}
