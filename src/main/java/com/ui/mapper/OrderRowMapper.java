package com.ui.mapper;

import org.springframework.jdbc.core.RowMapper;
import com.ui.model.Order;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRowMapper implements RowMapper<Order> {

    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {

        Order order = new Order();
        order.setOrderId(rs.getLong("orderId"));
        order.setCustomerId(rs.getLong("customerId"));
        order.setEmployeeId(rs.getLong("employeeId"));
        order.setOrderDate(rs.getTimestamp("order_date"));
        order.setRequiredDate(rs.getDate("required_date"));
        order.setShippedDate(rs.getDate("shipped_date"));
        order.setShippedVia(rs.getLong("shipped_via"));
        order.setShippName(rs.getString("shipp_name"));
        order.setShippAddress(rs.getString("shipp_address"));
        order.setShippCity(rs.getString("shipp_city"));
        order.setShippRegion(rs.getString("shipp_region"));
        order.setShippPostalCode(rs.getString("shipp_postal_code"));
        order.setShippingCountry(rs.getString("shipping_country"));
        order.setOrderStatus(rs.getString("order_status"));
        order.setTotalAmount(rs.getBigDecimal("total_amount"));
        order.setPaymentMethod(rs.getString("payment_method"));
        order.setPaymentStatus(rs.getString("payment_status"));
        order.setTrackingNumber(rs.getString("tracking_number"));

        return order;
    }

}
