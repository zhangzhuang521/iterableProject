package com.itheima.classlocal.test02;

import com.itheima.classlocal.domain.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        //获取class字节码对象
        Class studentClass1 = Student.class;
        Student student = new Student();
        Class studentClass2 = student.getClass();
        Class studentClass3 = Class.forName("com.itheima.classlocal.domain.Student");
        System.out.println(studentClass1);
//        System.out.println(studentClass2);
//        System.out.println(studentClass3);

//        Constructor[] declaredConstructors = studentClass1.getDeclaredConstructors();
//        for (Constructor declaredConstructor : declaredConstructors) {
//            System.out.println(declaredConstructor);
//        }
//        Field[] declaredFields = studentClass1.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }
//        Method[] declaredMethods = studentClass1.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod);
//        }
//        Constructor declaredConstructor = studentClass1.getDeclaredConstructor(String.class, int.class);
////        Student student1= (Student) declaredConstructor.newInstance("ZHANGSAN",18);
////        System.out.println(student1);
//       Student  student1 = (Student) studentClass1.newInstance();
//        System.out.println(student1);
//        Field name = studentClass1.getDeclaredField("name");
//        Student  student1 = (Student) studentClass1.newInstance();
//       name.setAccessible(true);
//        name.set(student1,"lisi");
//        String o = (String) name.get(student1);
//        System.out.println(o);
//        System.out.println(student1);

        Method method = studentClass1.getDeclaredMethod("show",String.class);
        Student  student1 = (Student) studentClass1.newInstance();
        method.setAccessible(true);
        String name = (String) method.invoke(student1, "wangwu");
        System.out.println(name);
    }
}
