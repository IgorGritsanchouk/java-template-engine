package com.ui.model;

import com.ui.util.FINAL;
import lombok.Data;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.lang.Long;
import java.sql.Date;
import java.text.SimpleDateFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.FutureOrPresent;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@Table("orders")
public class Order {

    @Id
    private Long orderId;
    private Long customerId;
    private Long employeeId;
    private Timestamp orderDate;
    @FutureOrPresent(message = "date.validation.label")
    private Date requiredDate;
    @FutureOrPresent(message = "date.validation.label")
    private Date shippedDate;
    private Long shippedVia;

    @NotBlank(message = "Shipment name is required.")
    private String shippName;
    @NotBlank(message = "Shipment address is required.")
    private String shippAddress;
    @NotBlank(message = "Shipment city is required.")
    private String shippCity;
    private String shippRegion;
    private String shippPostalCode;
    @NotBlank(message = "Shipment country is required.")
    private String shippingCountry;
    private String orderStatus;

   //@NotBlank(message = "Total amount is required.")
    //@Pattern(regexp = "^\\\\d+\\\\.\\\\d{2}$", message = "Numeric value is required with two decimal places.")
    private BigDecimal totalAmount;
    private String paymentMethod;
    private String paymentStatus;
    @NotBlank(message = "Tracking number is required.")
    private String trackingNumber;

//    public String getRequiredDateStr(){
//        SimpleDateFormat sdf = new SimpleDateFormat(FINAL.DATE_FORMAT); //"yyyy-mm-dd"
//        String requiredDateStr= (this.getRequiredDate() != null) ? sdf.format(this.getRequiredDate()) : "";
//        System.out.println("XXX yyyy-mm-dd required date validation : "+ requiredDateStr);
//        return requiredDateStr;
//    }

}
