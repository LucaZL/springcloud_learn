package com.zl.springcloud_learn.command;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetUtils {

    public static boolean isLocalPortUsing(int port) {
        boolean flag = true;
        try{
            flag = isPortUsing("127.0.0.1", port);
        }catch (Exception e) {
        }
        return flag;
    }

    public static boolean isPortUsing(String host, int port) throws UnknownHostException {
        boolean flag = false;
        InetAddress theAddress = InetAddress.getByName(host);
        try{
            Socket socket = new Socket(theAddress, port);
            flag = true;
        }catch (IOException e) {
        }
        return flag;
    }

    public static boolean isPortUsingWithServerSocket(String host, int port) throws UnknownHostException {
        boolean flag = true;
        try{
            ServerSocket socket = new ServerSocket(port);
            flag = false;
            socket.close();
        }catch (IOException e) {
        }
        return flag;
    }
}
