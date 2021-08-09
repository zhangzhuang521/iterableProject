package com.itheima01.test07;

public class MyRunnable implements Runnable {
    //定义一个变量
    private static int pick = 100;

    @Override
    public void run() {
        while (true) {
            //同步方法
            if ("窗口一".equals(Thread.currentThread().getName())) {
                boolean result = synchronizedMethod();
                if (result) {
                    break;
                }
            }
            //同步代码块
            if ("窗口二".equals(Thread.currentThread().getName())) {
                synchronized (this) {//this代表正在进行线程的对象
                    if (pick <= 0) {
                        break;
                    } else {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        pick--;
                        System.out.println(Thread.currentThread().getName() + "正在售票，还剩余" +pick+ "张");
                    }
                }
            }
        }
    }

    private synchronized boolean synchronizedMethod() {
        if (pick <= 0) {
            return true;
        } else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pick--;
            System.out.println(Thread.currentThread().getName() + "正在售票，还剩余" +pick+ "张");
            return false;
        }
    }
}
