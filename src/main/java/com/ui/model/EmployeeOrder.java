package com.ui.model;

import java.sql.Timestamp;
import java.util.Objects;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeOrder {

    // employee information
    private Long employeeId;
    private String firstName;
    private String lastName;
    private Long mobilePhone;

    // order information
    private Long orderId;
    private Timestamp orderDate;
    private String orderStatus;
    private String trackingNumber;

    // customer information
    private Long customerId;
    private String companyName;
    private String phone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeOrder employeeOrder)) return false;
        return Objects.equals(getEmployeeId(), employeeOrder.getEmployeeId()) && Objects.equals(getFirstName(), employeeOrder.getFirstName()) && Objects.equals(getLastName(), employeeOrder.getLastName()) && Objects.equals(getMobilePhone(), employeeOrder.getMobilePhone()) && Objects.equals(getOrderId(), employeeOrder.getOrderId()) && Objects.equals(getOrderDate(), employeeOrder.getOrderDate()) && Objects.equals(getOrderStatus(), employeeOrder.getOrderStatus()) && Objects.equals(getTrackingNumber(), employeeOrder.getTrackingNumber()) && Objects.equals(getCustomerId(), employeeOrder.getCustomerId()) && Objects.equals(getCompanyName(), employeeOrder.getCompanyName()) && Objects.equals(getPhone(), employeeOrder.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId(), getFirstName(), getLastName(), getMobilePhone(), getOrderId(), getOrderDate(), getOrderStatus(), getTrackingNumber(), getCustomerId(), getCompanyName(), getPhone());
    }

}
