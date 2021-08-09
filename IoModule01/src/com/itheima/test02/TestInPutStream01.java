package com.itheima.test02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestInPutStream01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IoModule01\\b.txt");
        //只能每次读取一个字节
//        int read = fis.read();
//        System.out.println((char) read);

//        byte[] bytes=new byte[8192];
//        int len;
//        while((len=fis.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }
        byte[] bytes=new byte[8192];
        while((fis.read(bytes))!=-1){
            System.out.println(new String(bytes));
        }
        fis.close();

    }
}
