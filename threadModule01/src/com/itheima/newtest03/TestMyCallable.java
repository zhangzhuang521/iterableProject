package com.itheima.newtest03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestMyCallable {
    public static void main(String[] args) {
        //创建MyCallable对象
        MyCallable mc1 = new MyCallable();
        //创建FutureTask对象，作用一是获取执行结束后的返回值，第二可以当做参数传递给Thread(ft1)
        FutureTask<String> ft1 = new FutureTask<String>(mc1);
        //创建Thread对象
        Thread t1 = new Thread(ft1);
        //启动线程
        t1.start();
        //创建MyCallable对象
        MyCallable mc2 = new MyCallable();
        //创建FutureTask对象，作用一是获取执行结束后的返回值，第二可以当做参数传递给Thread(ft1)
        FutureTask<String> ft2 = new FutureTask<String>(mc2);
        Thread t2 = new Thread(ft2);
        //启动线程
        t2.start();

    }
}
