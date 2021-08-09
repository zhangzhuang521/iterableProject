package com.itheima.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutPutStream01 {
    public static void main(String[] args) throws IOException {
        //字节输出流
        FileOutputStream fos = new FileOutputStream(new File("IoModule01\\a.txt"),true);
        //一次写一个字节
//        fos.write(97);
        byte[] bytes = {97, 98, 99, 100, 101};
//        fos.write(bytes);
        fos.write(bytes,0,3);
        //释放流
        fos.close();

    }
}
