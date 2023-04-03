package com.example.returnjson;

import com.example.pojo.User;
import lombok.Data;

import java.util.List;

@Data
public class UserFindJson {
    private int statue;
    private String info;
    private List<User> users;
    private User user;
    private String data;
}
