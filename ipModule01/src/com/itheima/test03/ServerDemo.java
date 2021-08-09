package com.itheima.test03;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//TCP 服务器端
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端对象
        ServerSocket ss = new ServerSocket(1000);
        //阻塞等待
        Socket accept = ss.accept();
        //获取流对象
        InputStream is = accept.getInputStream();
        //读数据
        int len;
        while ((len = is.read()) != -1) {
            System.out.print((char) len);
        }
        //释放流
        is.close();
        ss.close();

    }
}
