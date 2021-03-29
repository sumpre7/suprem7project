package com.supreme7.netty.BIO;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2020/11/4 11:14 下午
 * @Description: 客户端
 */
public class helloClient {

    public Object send(String ip ,int port){
        try {
            Socket socket = new Socket(ip,port);
            OutputStream outputStream = socket.getOutputStream();
            //outputStream.write("客户端发送".getBytes());
            return socket.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static void main(String[] args) {
        helloClient helloClient = new helloClient();
        System.out.println(helloClient.send("127.0.0.1", 9999));
        System.out.println("client");
    }
}
