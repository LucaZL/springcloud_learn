package com.zl.springcloud_learn.command;

import java.util.Random;

public class ServerPortUtils {
    public static int getAvailablePort() {
        int max = 65535;
        int min = 2000;
        Random random = new Random();
        int port = random.nextInt(max - min) + min;
        boolean using = NetUtils.isLocalPortUsing(port);
        if(using) {
            return getAvailablePort();
        }else{
            return port;
        }
    }
}
