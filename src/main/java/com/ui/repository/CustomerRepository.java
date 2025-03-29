package com.ui.repository;

import com.ui.model.Customer;
import org.springframework.data.repository.ListCrudRepository;

public interface CustomerRepository extends ListCrudRepository<Customer,Long> {
}
