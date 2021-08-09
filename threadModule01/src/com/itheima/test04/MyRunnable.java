package com.itheima.test04;


import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {
    private int pink = 100;
    private Object object = new Object();
    private ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {
        //做一个死循环，不知道循环多少次
        while (true) {
            //同步代码块
            lock.lock();
                //判断票的数量
                if (pink == 0) {
//                    System.out.println("票已售光");
                    break;
                } else {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pink--;
                    System.out.println(Thread.currentThread().getName() + "正在售票，还剩余" + pink + "张");
                }
                lock.unlock();

        }
    }
}
