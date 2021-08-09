package com.itheima.newtest01;

public class TestMyThread {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        //创建MyThread对象
        MyThread m1 = new MyThread();
        m1.setName("飞机");
        MyThread m2 = new MyThread("火车");

        //启动线程
        m1.start();
        m2.start();

    }
}
