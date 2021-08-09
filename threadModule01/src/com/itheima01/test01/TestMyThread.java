package com.itheima01.test01;
//测试类
public class TestMyThread {
    public static void main(String[] args) {
        //创建对象
        MyThread m1 = new MyThread();
        m1.start();
        MyThread m2 = new MyThread();
        //启动线程
//        m1.start();
        m2.start();
    }
}
