package com.itheima.test01;

public class TestMyThread {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        //创建类对象
        MyThread t1 = new MyThread();

        t1.setName("飞机");
        //启动线程 ，利用JVM虚拟机来调用run()方法
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("火车");
        //启动线程 ，利用JVM虚拟机来调用run()方法
        t2.setDaemon(true);
        t2.start();





    }
}
