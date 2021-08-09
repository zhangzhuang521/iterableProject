package com.itheima.newtest05;

public class TestMyRunnable {
    public static void main(String[] args) {
        //创建参数对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread thread1 = new Thread(mr);
        Thread thread2 = new Thread(mr);
        thread1.setPriority(5);
        thread1.setName("窗口一");
        thread2.setPriority(5);
        thread2.setName("窗口二");
        //启动线程
        thread1.start();
        thread2.start();


    }
}
