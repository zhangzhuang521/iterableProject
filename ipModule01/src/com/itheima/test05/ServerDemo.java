package com.itheima.test05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        ServerSocket serverSocket = new ServerSocket(8889);
        while (true) { //可以多次接收数据
            //阻塞等待
            Socket socket = serverSocket.accept();
            ThreadSocket threadSocket = new ThreadSocket(socket);
            Thread thread = new Thread(threadSocket);
            thread.start();
        }
    }
}
