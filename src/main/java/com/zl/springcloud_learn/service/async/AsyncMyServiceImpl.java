package com.zl.springcloud_learn.service.async;

import com.sun.org.apache.xerces.internal.dom.AbortException;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import java.lang.reflect.UndeclaredThrowableException;

@Service
public class AsyncMyServiceImpl implements AsyncMyService {
    @Override
    public void continuePrintNumber() {
        for(int i = 0; i < 20; i++) {
            System.out.println(i);
            if(i > 10) throw new AbortException();
        }
    }
}
