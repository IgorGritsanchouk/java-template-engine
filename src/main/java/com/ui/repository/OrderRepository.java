package com.ui.repository;

import com.ui.model.Order;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<Order,Long> {
}
