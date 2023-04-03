package com.example.service;

import com.example.pojo.User;

import java.util.List;

public interface UserService {
    boolean add(User user);
    boolean del(int uid);
    boolean update(User user);
    User find(int uid);
    List<User> findAll();
}
