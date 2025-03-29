package com.ui.model;

import com.ui.model.Order;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@NoArgsConstructor
@Data
public class OrderForm {

    private Order order;
    private Map<String, String> countries;
    private Map<Long, String> employeeDropDown;
    private Map<Long, String> customerDropDown;

}
