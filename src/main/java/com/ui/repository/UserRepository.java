package com.ui.repository;

import com.ui.model.User;
import org.springframework.data.repository.ListCrudRepository;
public interface UserRepository extends ListCrudRepository<User,Long> {
}
