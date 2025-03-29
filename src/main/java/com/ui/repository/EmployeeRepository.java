package com.ui.repository;

import com.ui.model.Employee;
import org.springframework.data.repository.ListCrudRepository;

public interface EmployeeRepository extends ListCrudRepository<Employee,Long> {
}
