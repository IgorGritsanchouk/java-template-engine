package com.ui.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.lang.Long;
import java.sql.Date;
import java.sql.Timestamp;
import java.math.BigDecimal;
//import java.util.Date;

@Data
@NoArgsConstructor
@Table("employees")
public class Employee {

//    private Integer EmployeeId;
//    private Float salary;
//    private Integer orderId;
//    private Date orderDate;
//    private String shipName;

    @Id
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String title;
    private Date birthDate;
    private Timestamp hireDate;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String homePhone;
    private String extention;
    private byte[] photo;
    private String notes;
    private BigDecimal salary;
    private Long mobilePhone;
    private String jobId;
    private BigDecimal commissionPct;
    private Integer managerId;
    private Integer departmentId;

}
