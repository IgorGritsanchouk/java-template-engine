package com.ui.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.util.Objects;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Table("customers")
public class Customer {

    @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @NotBlank(message = "Company name is required.")
    @Size(min = 2, max = 50, message = "Company name must be between 2 and 50 characters")
    private String companyName;

    @NotBlank(message= "The contact name is required.")
    @Size(min = 2, max = 50, message = "Contact name must be between 2 and 50 characters")
    private String contactName;

    @NotBlank(message= "The contact title is required.")
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private String postalCode;

    @NotBlank(message = "Country is required.")
    //@Pattern(regexp = "^[A-Z]{2}$", message = "Country code must be a 2-letter country code")
    private String country;
    private String phone;
    private Timestamp createdAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return Objects.equals(getCustomerId(), customer.getCustomerId()) && Objects.equals(getCompanyName(), customer.getCompanyName()) && Objects.equals(getContactName(), customer.getContactName()) && Objects.equals(getContactTitle(), customer.getContactTitle()) && Objects.equals(getAddress(), customer.getAddress()) && Objects.equals(getCity(), customer.getCity()) && Objects.equals(getRegion(), customer.getRegion()) && Objects.equals(getPostalCode(), customer.getPostalCode()) && Objects.equals(getCountry(), customer.getCountry()) && Objects.equals(getPhone(), customer.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerId(), getCompanyName(), getContactName(), getContactTitle(), getAddress(), getCity(), getRegion(), getPostalCode(), getCountry(), getPhone());
    }
}
