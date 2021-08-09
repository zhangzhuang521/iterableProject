package com.itheima01.test01;
//定义一个类继承Thread接口
public class MyThread extends Thread {
    //重写run()方法

    @Override
    public void run() {
        //10循环
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+" "+i);
        }
    }
}
