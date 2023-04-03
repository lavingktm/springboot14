package com.example.springbootmybatis14;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
@MapperScan("com.example.mapper")
public class SpringBootMybatis14Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatis14Application.class, args);
    }

}
