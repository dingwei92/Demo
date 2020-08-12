package com.example.demo.controller;

import com.example.demo.config.MyProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private MyProp myProp;

    @RequestMapping("/hello")
    public String hello() throws Exception {
        String name=myProp.getName();
        Integer age=myProp.getAge();
        List<String> list=myProp.getAddress();
        return name+age+list;
    }
}
