package com.example.service.Impl;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean add(User user) {
      int row=  userMapper.add(user);
        return row>0;
    }

    @Override
    public boolean del(int uid) {
      int row=  userMapper.del(uid);
        return row>0;
    }

    @Override
    public boolean update(User user) {
     int row=   userMapper.update(user);
        return row>0;
    }

    @Override
    public User find(int uid) {
        return userMapper.findById(uid);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
