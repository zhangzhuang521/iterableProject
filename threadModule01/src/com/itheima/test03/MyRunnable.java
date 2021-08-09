package com.itheima.test03;

public class MyRunnable implements Runnable {
    //定义了一个变量
    private static int pink = 100;

    @Override
    public void run() {
        while (true) {
            if ("窗口一".equals(Thread.currentThread().getName())) {
                boolean flag = synchronizedMethod();
                if (flag) {
                    break;
                }
            }
            if ("窗口二".equals(Thread.currentThread().getName())) {
                synchronized (this) {
                    System.out.println(this.getClass().getName());
                    if (pink == 0) {
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
                }
            }
//            if ("窗口二".equals(Thread.currentThread().getName())) {
//                synchronized (MyRunnable.class) {
//                    if (pink == 0) {
//                        break;
//                    } else {
//                        try {
//                            Thread.sleep(200);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        pink--;
//                        System.out.println(Thread.currentThread().getName() + "正在售票，还剩余" + pink + "张");
//                    }
//                }
//            }
        }
    }

    //同步方法
    private  synchronized boolean synchronizedMethod() {
        if (pink == 0) {
            return true;
        } else {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pink--;
            System.out.println(Thread.currentThread().getName() + "正在售票，还剩余" + pink + "张");
            return false;
        }
    }
}
