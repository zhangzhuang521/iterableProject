package com.itheima.test01;

public class TestMyRunnable {
    public static void main(String[] args) {
        //创建实现类的接口对象
        MyRunnable mr1 = new MyRunnable();
        //将接口对象作为参数来创建线程对象
        Thread t1 = new Thread(mr1);
        //启动线程



        Thread t2 = new Thread(mr1);
        t1.start();
        //启动线程
        t2.start();


    }
}
