package com.itheima.newtest03;

import java.util.concurrent.Callable;
//定义一个类闪现Callable接口
public class MyCallable implements Callable<String> {
    //重写call方法
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        return "表白成功！";
    }
}
