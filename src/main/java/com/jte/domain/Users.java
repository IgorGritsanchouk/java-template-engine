package com.jte.domain;

import java.util.List;

public class Users{

    private List<User> users;
    public Users(List<User> users){
        this.users= users;
    }
    public List<User> getUsers(){
        return this.users;
    }
}
