package com.itheima.test04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter01 {
    public static void main(String[] args) throws IOException {
        //创建缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("IoModule01\\c.txt"));
        bw.write(97);
        bw.newLine();
        bw.write("黑马程序员");
        bw.newLine();
//        char[] chars=new char[]{97,65,48,47,46};
//
//        bw.write(chars,0,3);
        String s="黑马程勋员";
        bw.write(s,0,3);
        bw.flush();
        bw.close();


    }
}
