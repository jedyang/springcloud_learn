package com.yunsheng.ribbon.controller;

import com.yunsheng.ribbon.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConsumeHelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/consume/{name}")
    public String consume(@PathVariable String name) {
        String s = helloService.hiService(name);

        return s;
    }

    @Value("${spring.jdbc.host}")
    private String host;

    @Value("${spring.jdbc.port}")
    private String port;

    @Value("${spring.jdbc.user}")
    private String user;

    @Value("${spring.jdbc.password}")
    private String password;

    @GetMapping("/jdbcInfo")
    public String jdbcInfo() {
        StringBuffer sb = new StringBuffer();
        sb.append(host).append(":")
                .append(port).append(":")
                .append(user).append(":")
                .append(password);

        return sb.toString();
    }
}
