package com.yunsheng.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "defaultFallback")
    public String hiService(String name) {
        String result = restTemplate.getForObject("http://SERVICE-HELLO/hello/" + name, String.class);

        return result;
    }

    public String defaultFallback(String name) {
        return "断路器打开：" + name;
    }
}
