package com.itheima01.test02;

public class TestMyRunnable {
    public static void main(String[] args) {
        MyRunnable my1 = new MyRunnable();
        Thread t1 = new Thread(my1);
        Thread t2 = new Thread(my1);
        t1.start();
        t2.start();


    }
}
