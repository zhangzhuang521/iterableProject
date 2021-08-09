package com.itheima.test01;

import java.io.*;

public class TestOutPutStream02 {
    public static void main(String[] args) {
        //缓冲字节输出流
        BufferedOutputStream bfos = null;
        try {
            bfos = new BufferedOutputStream(new FileOutputStream("IoModule01\\b.txt", true));
            byte[] bytes = {97, 98, 99, 100};
            try {
                bfos.write(bytes, 0, 3);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (bfos != null) {
                try {
                    bfos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//        bfos.write(97);


    }
}
