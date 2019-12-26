package com.zl.springcloud_learn.service.async;

import org.springframework.scheduling.annotation.Async;

@Async
public interface AsyncMyService {
    void continuePrintNumber();
}
