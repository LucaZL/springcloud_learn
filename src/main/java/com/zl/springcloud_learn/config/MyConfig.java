package com.zl.springcloud_learn.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "user.zl")
@Component
@Data
public class MyConfig {
    private String name;
    private String password;
}
