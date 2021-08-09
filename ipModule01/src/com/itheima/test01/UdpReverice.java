package com.itheima.test01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReverice {
    public static void main(String[] args) throws IOException {
        //创建接收端数据对象
        DatagramSocket ds = new DatagramSocket(3000);
        //创建数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //接受数据
        ds.receive(dp);
        System.out.println(new String(bytes,0,dp.getLength()));
        ds.close();
    }
}
