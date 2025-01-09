package com.jte.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Getter
@Setter
@Table("users")
public class User {

    @Id
    private Long id;

    @NotBlank(message= "The first name should not be blank.")
    private String firstName;

    @NotBlank(message= "The last name should not be blank.")
    private String lastName;

    private String email;
    private String country;
    private String streetAddress;
    private String city;
    private String region;
    private String postalCode;

    public User(){}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getFirstName(), user.getFirstName()) && Objects.equals(getLastName(), user.getLastName()) && Objects.equals(getEmail(), user.getEmail()) && Objects.equals(getCountry(), user.getCountry()) && Objects.equals(getStreetAddress(), user.getStreetAddress()) && Objects.equals(getCity(), user.getCity()) && Objects.equals(getRegion(), user.getRegion()) && Objects.equals(getPostalCode(), user.getPostalCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getEmail(), getCountry(), getStreetAddress(), getCity(), getRegion(), getPostalCode());
    }
}
