package com.itheima.test.test01;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest01 {
//    public static void main(String[] args) {
//        int i = testAdd();
//        System.out.println(i);
//    }

    @Test
    public void testAdd() {
        int a = 10;
        int b = 20;
        int c=a+b;
        Assert.assertEquals(30,c);
        System.out.println(c);
    }
}
