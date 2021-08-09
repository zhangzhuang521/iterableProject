package com.itheima01.test04;

public class TestMyThread {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        my1.setName("窗口一");
        my2.setName("窗口二");
        my1.start();
        my2.start();
    }
}
