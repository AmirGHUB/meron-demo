package com.example.meron.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @RequestMapping("/hello")
    public String getGreeting(){
        return "hello world";
    }

}
