package com.itheima.newtest02;
//定义一个类闪现Runnable接口
public class MyRunnable implements Runnable {

    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
