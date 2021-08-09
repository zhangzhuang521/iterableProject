package com.itheima.test03;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

//TCP 客户端
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket sk = new Socket("127.0.0.1",1000);
        //获取一个IO流，在写数据
        OutputStream os = sk.getOutputStream();
        //写数据
        os.write("hello".getBytes());
        //释放流
        os.close();
        sk.close();
    }
}
