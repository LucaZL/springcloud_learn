package com.zl.springcloud_learn.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.task.pool")
@Data
public class TaskThreadPoolConfig {
    private int corePoolSize = 5;
    private int maxPoolSize = 50;
    private int keepAliveSeconds = 60;
    private int queueCapacity = 1000;
    private String threadNamePrefix = "ZL-AsyncTask";

}
