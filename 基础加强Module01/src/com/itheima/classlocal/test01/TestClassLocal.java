package com.itheima.classlocal.test01;

public class TestClassLocal {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //获取平台类加载器
        ClassLoader classLoader01 = systemClassLoader.getParent();
        //获取内置加载器
        ClassLoader classLoader02 = classLoader01.getParent();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@b4aac2
        System.out.println(classLoader01);//sun.misc.Launcher$ExtClassLoader@16d3586
        System.out.println(classLoader02);//null
    }
}
