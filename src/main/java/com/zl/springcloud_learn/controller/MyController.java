package com.zl.springcloud_learn.controller;

import com.zl.springcloud_learn.service.MyService;
import com.zl.springcloud_learn.service.async.AsyncMyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAsync
public class MyController {

    @Resource
    private MyService myService;

    @Resource
    private AsyncMyService asyncMyService;

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

    @GetMapping("asyncPrintNumber")
    public String asyncPrintNumber() {
        System.out.println("start print");
        asyncMyService.continuePrintNumber();
        System.out.println("end print");
        return "success";
    }
}
