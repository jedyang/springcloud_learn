package com.yunsheng.feign.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultFallback implements HelloService {
    @Override
    public String hello(String name) {
        return "feign中的断路器开启: " + name;
    }
}
