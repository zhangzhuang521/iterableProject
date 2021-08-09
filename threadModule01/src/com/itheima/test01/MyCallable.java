package com.itheima.test01;


import java.util.concurrent.Callable;
//实现Callable接口
public class MyCallable implements Callable<String> {

    //重写call方法
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        //有返回值的
        return "表白成功";
    }
}
