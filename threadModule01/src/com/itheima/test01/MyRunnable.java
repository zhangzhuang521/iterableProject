package com.itheima.test01;

//实现Runnable 接口
public class MyRunnable implements Runnable{
    //重写run() 方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            try {
////                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
