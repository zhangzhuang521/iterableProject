package com.itheima.test04;

import java.io.*;
import java.net.Socket;

//TCP 客户端
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket sk = new Socket("127.0.0.1", 1001);
        //获取一个IO流，在写数据
        OutputStream os = sk.getOutputStream();
        //写数据
        os.write("hello".getBytes());
        sk.shutdownOutput();// 断流，
//        InputStream is = sk.getInputStream();
//        int len;
//        while((len=is.read())!=-1){
//            System.out.println((char)len);
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        String len;
        while ((len = br.readLine()) != null) {
            System.out.println(len);
        }
        //释放流
        br.close();
        os.close();
        sk.close();
    }
}
