package com.itheima01.test06;

import java.util.concurrent.FutureTask;

public class TestMycallable {
    public static void main(String[] args) {
        MyCallable my1 = new MyCallable();
        FutureTask<String> sf1 = new FutureTask<>(my1);
        Thread t1 = new Thread(sf1,"窗口一");
        t1.start();
        MyCallable my2 = new MyCallable();
        FutureTask<String> sf2 = new FutureTask<>(my2);
        Thread t2 = new Thread(sf2,"窗口二");
        t2.start();

    }
}
