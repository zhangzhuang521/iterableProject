package com.itheima.test02;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ClientDmeo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if("886".equals(s)){
                break;
            }
            byte[] bytes = s.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("127.0.0.1"),10000);
            ds.send(dp);
        }
        ds.close();

    }
}
