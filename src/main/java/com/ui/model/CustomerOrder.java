package com.ui.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class CustomerOrder {

    private Integer employeeId;
    private BigDecimal salary;

    private Integer orderId;

    private Timestamp orderDate;

    private String shippName;


}
