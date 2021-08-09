package com.itheima.test04;

public class TestMyRunnable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread T1 = new Thread(myRunnable,"窗口一");
        Thread T2 = new Thread(myRunnable,"窗口二");
        Thread T3 = new Thread(myRunnable,"窗口三");
        T1.start();
        T2.start();
        T3.start();

    }
}
