package cn.itheima.test01;

import cn.itheima.domain.Student;

public class TestObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1);
        System.out.println(s1.equals(s2));


    }
}
