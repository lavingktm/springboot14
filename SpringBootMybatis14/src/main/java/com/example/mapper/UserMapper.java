package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    int add(@Param(value = "user1") User user);
    int del(int uid);
    int update(@Param(value = "user2") User user);
    User findById(int uid);
    //查所有数据
    List<User> findAll();
}
