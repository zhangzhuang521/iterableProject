package com.itheima01.test09;


import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {
    private static int pink = 100;
    //lock锁
    private ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            //添加锁
            try {
                reentrantLock.lock();
                if (pink <= 0) {
                    break;
                } else {
                    Thread.sleep(100);
                    pink--;
                    System.out.println(Thread.currentThread().getName() + "正在买票，还剩余" + pink + "张票");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
