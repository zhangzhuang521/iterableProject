package com.itheima.newtest05;

//同步代码块
public class MyRunnable implements Runnable {
    //定义一个车票的数量
    private static int pick = 100;
    //创建任意对象
//    private Object object = new Object();

    //重写run方法
    @Override
    public void run() {
        while (true) {
            //同步代码块
//            synchronized (object) {
//                if (pick <= 0) {
//                    break;
//                } else {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    pick--;
//                    System.out.println(Thread.currentThread().getName() + "正在售票，还剩余" + pick + "张车票");
//                }
//            }
            if ("窗口一".equals(Thread.currentThread().getName())) {
                boolean b = synchronizedMethod();
                if(b){
                    break;
                }
            }
            if ("窗口二".equals(Thread.currentThread().getName())) {
                synchronized (MyRunnable.class) {
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
                }
            }
        }
    }

    private static synchronized boolean synchronizedMethod() {
        if (pick <= 0) {
            return true;
        } else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pick--;
            System.out.println(Thread.currentThread().getName() + "正在售票，还剩余" + pick + "张车票");
            return false;
        }
    }
}
