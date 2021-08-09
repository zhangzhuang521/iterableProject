package com.itheima.newtest06;

public class TestMyRunnable {
    public static void main(String[] args) {
        //创建参数对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread thread1 = new Thread(mr);
        Thread thread2 = new Thread(mr);
        Thread thread3 = new Thread(mr);
        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");
        //启动线程
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
