package com.itheima01.test05;

public class TestMyRunnable {
    public static void main(String[] args) {
        MyRunnable my1 = new MyRunnable();
        Thread t1 = new Thread(my1,"窗口一");
        Thread t2 = new Thread(my1,"窗口二");
        t1.start();
        t2.start();
    }
}
