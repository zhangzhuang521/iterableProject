package com.itheima.newtest06;

import java.util.concurrent.locks.ReentrantLock;

//同步代码块
public class MyRunnable implements Runnable {
    //定义一个车票的数量
    private int pick = 100;
    //创建任意对象
    private Object object = new Object();
    private ReentrantLock lock=new ReentrantLock();
    //重写run方法
    @Override
    public void run() {
        while (true) {
            //同步代码块
            lock.lock();
                if (pick <= 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pick--;
                    System.out.println(Thread.currentThread().getName() + "正在售票，还剩余" + pick + "张车票");
                }
            lock.unlock();
        }
    }
}
