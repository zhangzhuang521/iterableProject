package com.itheima.test02;

import java.io.*;

public class TestInPutStream02 {
    public static void main(String[] args) throws IOException {
        //读取该文件
        BufferedInputStream bips = new BufferedInputStream(new FileInputStream("IoModule01\\b.txt"));
        //写到给文件
        BufferedOutputStream bops= new BufferedOutputStream(new FileOutputStream("IoModule01\\bb.txt",true));

        //创建数组对象，长度为1024*8
        byte[] bytes = new byte[102 * 8];

        int len;
        while((len=bips.read(bytes))!=-1){
            bops.write("\r\n".getBytes());
            bops.write(bytes,0,len);

        }
        bips.close();
        bops.close();

    }
}
