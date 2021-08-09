package com.itheima.newtest02;

public class TestMyRunnable {
    public static void main(String[] args) {
        //创建MyRunnable对象
        MyRunnable mr1 = new MyRunnable();
        //创建线程对象，参数MyRunnable对象
        Thread t1 = new Thread(mr1);
        //开启线程
        t1.setPriority(10);
        int priority = t1.getPriority();
        System.out.println(priority);
        t1.start();
        MyRunnable mr2 = new MyRunnable();
        //创建线程对象，参数MyRunnable对象
        Thread t2 = new Thread(mr2);
        //开启线程
        t2.start();

    }
}
