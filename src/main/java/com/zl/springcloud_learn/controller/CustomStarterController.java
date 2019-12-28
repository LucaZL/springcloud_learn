package com.zl.springcloud_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import com.zl.starter.export.user.UserClient;

@RestController
public class CustomStarterController {

    @Resource
    private UserClient userClient;

    @GetMapping("/userclient/name")
    public String getStartUserClientName() {
        return userClient.getName();
    }
}
