package com.supreme7.netty.BIO;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2020/11/4 10:57 下午
 * @Description:  服务端
 */
public class helloServer {

    public void Start(int port){
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();
                if (socket!=null){
                // 通过输入流获取客户端的信息
                socket.getInputStream();
                System.out.println("server get inpputStream "+socket.getInputStream().toString());

                OutputStream outputStream = socket.getOutputStream();
                //outputStream.write("已经接收".getBytes());
                outputStream.flush();
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        helloServer helloServer = new helloServer();
        helloServer.Start(9999);
    }
}
