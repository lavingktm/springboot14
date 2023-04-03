package com.example.controller;

import com.example.pojo.User;
import com.example.returnjson.UserFindJson;
import com.example.returnjson.UserJson;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public UserJson add(@RequestBody User user){
        UserJson userJson=new UserJson();
        userJson.setStatue(200);
        userJson.setData("失败");
        userJson.setInfo("添加数据");
      boolean isok=  userService.add(user);
      if(isok==true){
          userJson.setData("成功");
      }
      return userJson;
    }
    @DeleteMapping("/{uid}")
    public UserJson del(@PathVariable int uid){
        UserJson userJson=new UserJson();
        userJson.setInfo("删除数据");
        userJson.setData("失败");
        userJson.setStatue(200);
    boolean isok= userService.del(uid);
    if(isok==true){
        userJson.setData("成功");
    }
        return userJson;
    }
    @PutMapping
    public  UserJson update(@RequestBody User user){
        UserJson userJson=new UserJson();
        userJson.setStatue(200);
        userJson.setData("失败");
        userJson.setInfo("更新数据");
        boolean isok=userService.update(user);
        if(isok==true){
            userJson.setData("成功");
        }
        return  userJson;
    }
    @GetMapping("/{uid}")
    public UserFindJson find(@PathVariable int uid){
        User user= userService.find(uid);
        UserFindJson userFindJson=new UserFindJson();
        userFindJson.setStatue(200);
        userFindJson.setInfo("查数据");
        userFindJson.setUser(user);
        return  userFindJson;
    }
    @GetMapping
    public UserFindJson findAll(){
        List<User> user=userService.findAll();
        UserFindJson userFindJson=new UserFindJson();
        userFindJson.setUsers(user);
        userFindJson.setStatue(200);
        userFindJson.setInfo("查所有数据");
        return userFindJson;
    }
}
