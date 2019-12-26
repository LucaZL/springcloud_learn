package com.zl.springcloud_learn.service.async;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
public class AsyncMyServiceImpl implements AsyncMyService {
    @Override
    public void continuePrintNumber() {
        for(int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
