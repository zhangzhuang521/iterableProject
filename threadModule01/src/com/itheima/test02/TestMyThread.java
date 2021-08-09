package com.itheima.test02;

public class TestMyThread {
    public static void main(String[] args) {
        //三个窗口相当于三个线程 ,这种方式不行
        //多条线程操作同一个共享资源
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();

    }
}
