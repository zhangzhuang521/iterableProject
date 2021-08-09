package cn.itheima.test01;

import cn.itheima.domain.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan",18);
        Person person2 = new Person("zhangsan",18);
        //没有重写tostring方法之前
        System.out.println(person1);//cn.itheima.domain.Person@16d3586
        System.out.println(person1.toString());//cn.itheima.domain.Person@16d3586
        System.out.println(person2);//cn.itheima.domain.Person@154617c
        System.out.println(person1.equals(person2));//false
        int[] ints = new int[10];
        System.out.println(ints);//[I@a14482

        System.out.println("---------------");
        System.out.println(person1);//Person{name='zhangsan', age=18}
        System.out.println(person1.toString());//Person{name='zhangsan', age=18}
        System.out.println(person2);//Person{name='lisi', age=20}
        System.out.println(person1.equals(person2));//false
        int[] ints1 = new int[10];
        System.out.println(ints1);//[I@a14482


    }
}
