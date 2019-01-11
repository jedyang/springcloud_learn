package com.yunsheng.ribbon.controller;

import com.yunsheng.ribbon.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeHelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/consume/{name}")
    public String consume(@PathVariable String name){
        String s = helloService.hiService(name);

        return s;
    }

}
