package com.y.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorApplication.class, args);
	}

}
