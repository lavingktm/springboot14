package com.example.springboot008.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/test")
    public String test(){
        return "hello spring boot";
    }
}
