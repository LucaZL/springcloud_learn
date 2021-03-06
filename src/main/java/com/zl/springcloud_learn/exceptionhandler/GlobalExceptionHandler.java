package com.zl.springcloud_learn.exceptionhandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    @ResponseBody
    public ResponseData defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        logger.error(" ", e);
        ResponseData r = new ResponseData();
        r.setMessage(e.getMessage());
        if(e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            r.setCode(404);
        }else{
            r.setCode(500);
        }
        r.setData("系统异常");
        r.setStatus(false);
        return r;
    }
}
