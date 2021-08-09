package com.itheima.test05;

import java.io.*;

public class TestInPutStreamReader01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\bb.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\d.txt"));
        char[] chars=new char[1024];
        int len;
        while((len=isr.read(chars))!=-1){
            osw.write(chars,0,len);
        }
        isr.close();
        osw.close();
    }

}
