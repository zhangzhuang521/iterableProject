package com.itheima.test04;

import java.io.*;
import java.util.Arrays;

public class TestBuffered01 {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new FileReader("IoModule01\\cc.txt"));
        char[] chars=new char[1024];
        int len ;
        String s=null;
        while((len=br.read(chars))!=-1){
//            System.out.println(new String(chars,0,len));
             s = new String(chars, 0, len);
        }
        //数组翻转
        String[] strings = s.split(" ");
        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            int intValue = Integer.valueOf(strings[i]).intValue();
            ints[i]=intValue;
        }
        Arrays.sort(ints);
        //写数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("IoModule01\\cc.txt"));
        for (int i = 0; i < ints.length; i++) {
            bw.write(ints[i]+" ");
        }
        br.close();
        bw.close();
    }
}
