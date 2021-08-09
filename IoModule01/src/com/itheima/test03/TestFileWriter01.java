package com.itheima.test03;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter01 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("IoModule01\\b.txt");
//        fileWriter.write(97);
        fileWriter.write("黑马程序员");
        char[] chars=new char[]{97,98,99,100,101};
        fileWriter.write(chars,0,3);
        fileWriter.flush();
        fileWriter.close();
    }
}
