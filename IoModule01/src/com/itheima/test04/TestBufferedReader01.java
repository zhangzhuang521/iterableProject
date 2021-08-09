package com.itheima.test04;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IoModule01\\c.txt"));
//        char[] chars=new char[1024];
//        int len;
//        while((len=br.read(chars))!=-1){
//            System.out.println(new String(chars,0,len));
//        }

        String len;
        while((len=br.readLine())!=null){
            System.out.println(new String(len));
        }

    }
}
