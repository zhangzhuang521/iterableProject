package com.itheima.test03;


public class TestMyRunnable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread T1 = new Thread(myRunnable,"窗口一");
        Thread T2 = new Thread(myRunnable,"窗口二");
        T1.start();
        T2.start();


    }
}
