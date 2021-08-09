package com.itheima01.test03;

import java.util.concurrent.FutureTask;

public class TestMyCallable {
    public static void main(String[] args) {
        MyCallable my1 = new MyCallable();
        FutureTask<String> fk1 = new FutureTask<String>(my1);
        Thread t1 = new Thread(fk1);
        t1.start();
        MyCallable my2 = new MyCallable();
        FutureTask<String> fk2 = new FutureTask<String>(my2);
        Thread t2 = new Thread(fk2);
        t2.start();

    }
}
