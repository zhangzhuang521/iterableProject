package com.itheima.test01;

import java.util.concurrent.FutureTask;

public class TestMyCallable {
    public static void main(String[] args) throws Exception {
        //创建实现类的对象
        MyCallable mc = new MyCallable();
        //将实现类对象作为参数来创建FutureTask对象，主要提供线程结束后的返回值，作为参数来创建线程
        FutureTask<String> ft = new FutureTask<>(mc);
        //创建线程
        Thread t1 = new Thread(ft,"飞机");
        t1.setPriority(5);
        //启动线程

//        MyCallable mc1 = new MyCallable();
//        //将实现类对象作为参数来创建FutureTask对象，主要提供线程结束后的返回值，作为参数来创建线程
//        FutureTask<String> ft1 = new FutureTask<>(mc);
        Thread t2 = new Thread(ft,"火车");
//        int priority = t2.getPriority();
//        System.out.println(priority);
        t1.start();
        //启动线程
        t2.start();
    }
}
