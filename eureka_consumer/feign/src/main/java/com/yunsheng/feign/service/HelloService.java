package com.yunsheng.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 使用接口
 */
@FeignClient(name = "service-hello", fallback = DefaultFallback.class)
public interface HelloService {

    @GetMapping("/hello/{name}")
    String hello(@PathVariable(value = "name") String name);
}
