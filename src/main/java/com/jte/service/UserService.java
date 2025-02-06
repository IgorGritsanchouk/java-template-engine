package com.jte.service;

import com.jte.domain.User;

import java.util.List;

public interface UserService {

    List<User> selectUsersForCountry(String countryName);
    void saveUser(User user);
}
