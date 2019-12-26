package com.zl.springcloud_learn.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Endpoint(id = "user")
public class UserEndPoint {

    @ReadOperation
    public List<String> userEndPoint() {
        List<String> list = new ArrayList<>();
        list.add("test-user1");
        list.add("test-user2");
        return list;
    }
}
