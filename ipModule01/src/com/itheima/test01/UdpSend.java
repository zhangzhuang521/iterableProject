package com.itheima.test01;

import java.io.IOException;
import java.net.*;

public class UdpSend {
    public static void main(String[] args) throws IOException {
        //创建发送端数据对象
        DatagramSocket ds = new DatagramSocket();
        //创建数据包
        String s="你好吗？";
        byte[] bytes = s.getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("127.0.0.1"),3000);
        //发送数据
        ds.send(dp);
        //释放资源
        ds.close();


    }
}
