package com.zl.springcloud_learn.controller;

import com.zl.springcloud_learn.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MyController {

    @Resource
    private MyService myService;

    @GetMapping("/hi_name_1")
    public String hiName1(@RequestParam("number") Integer number) {
        switch(number) {
            case 2:
                return myService.hiName2();
            case 3:
                return myService.hiName3();
            default:
                return myService.hiName1();
        }
    }
}
