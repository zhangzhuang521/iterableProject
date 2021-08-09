package com.itheima.test03;


import sun.nio.cs.ext.GBK;

import java.io.FileReader;
import java.io.IOException;

public class TestFileReader01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("IoModule01\\bb.txt");
        char[] chars = new char[1024];
        int len;
        while((len=fileReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

        fileReader.close();
    }

}
