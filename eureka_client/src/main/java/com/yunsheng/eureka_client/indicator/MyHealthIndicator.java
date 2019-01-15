package com.yunsheng.eureka_client.indicator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyHealthIndicator extends AbstractHealthIndicator {

    @Value("${version}")
    String version;

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        if ("2.0.0".equalsIgnoreCase(version)) {
            builder.up();
        } else {
            log.warn("版本过低");
            builder.down();
        }
        builder.withDetail("version", version);
    }
}
