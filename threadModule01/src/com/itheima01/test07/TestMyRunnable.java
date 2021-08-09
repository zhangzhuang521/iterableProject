package com.itheima01.test07;

public class TestMyRunnable {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my, "窗口一");
        Thread t2 = new Thread(my, "窗口二");
        t1.start();
        t2.start();
    }
}
