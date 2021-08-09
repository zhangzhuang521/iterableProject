package com.itheima01.test05;



public class MyRunnable implements Runnable {
    private static int pink=100;
    private static Object obj=new Object();
    @Override
    public void run() {
        while(true){
            synchronized (obj) {
                if(pink<=0){
                    break;
                }else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pink--;
                    System.out.println(Thread.currentThread().getName()+"正在买票，还剩余"+pink+"张票");
                }
            }

        }

    }
}
