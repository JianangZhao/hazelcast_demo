package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("初始化之前加载-1");
        SpringApplication.run(Main.class, args);
        System.out.println("初始化之前加载-2");

    }

    @PostConstruct
    public void  intiFunction(){
        System.out.println("初始化之前加载-依赖注入后，业务开始前调用");
    }

}