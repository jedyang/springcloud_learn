package com.yunsheng.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 使用接口
 */
@FeignClient(name = "ervice-hello")
public interface HelloService {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name);
}
