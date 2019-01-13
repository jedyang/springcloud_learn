package com.yunsheng.feign.controller;

import com.yunsheng.feign.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class HelloServiceController {

    @Autowired
    private HelloService helloService;


    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        String hello = helloService.hello(name);

        return hello;
    }
}
