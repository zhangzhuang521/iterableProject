package com.itheima.test06;

import java.io.*;
import java.util.Properties;

public class TestProperties01 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        FileReader fileReader = new FileReader("IoModule01\\pr.properties");
        pro.load(fileReader);
        System.out.println(pro);
        FileWriter fileWriter = new FileWriter("a.txt");
        pro.store(fileWriter,"zhangsan");
        fileReader.close();
        fileWriter.close();

    }
}
