package com.zl.springcloud_learn.service;

import com.zl.springcloud_learn.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MyServiceImpl implements MyService {

    @Resource
    private Environment env;

    @Value("${user.zl.name}")
    private String userName;

    @Resource
    private MyConfig myConfig;

    @Override
    public String hiName1() {
        return "hi, (from environment). my name is: " + env.getProperty("user.zl.name");
    }

    @Override
    public String hiName2() {
        return "hi, (from @value). my name is: " + userName;
    }

    @Override
    public String hiName3() {
        return "hi, (from @ConfigurationProperties) my name is: " + myConfig;
    }
}
