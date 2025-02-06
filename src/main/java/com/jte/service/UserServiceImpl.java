package com.jte.service;

import com.jte.dao.UserDao;
import com.jte.domain.User;
import com.jte.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    private UserDao userDao;
    private UserRepository userRepository;

    public UserServiceImpl(UserDao userDao, UserRepository userRepository){
        this.userDao= userDao;
        this.userRepository= userRepository;
    }
    public List<User> selectUsersForCountry(String countryName){
       return userDao.selectUsersForCountry(countryName);
    }

    public void saveUser(User user){
        userDao.save(user);
    }
}
