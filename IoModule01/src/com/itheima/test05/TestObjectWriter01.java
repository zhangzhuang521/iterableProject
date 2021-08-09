package com.itheima.test05;

import com.itheima.domain.Student;

import java.io.*;
import java.util.ArrayList;


public class TestObjectWriter01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\d.txt"));
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("zhangsan", 19);
        Student s3 = new Student("zhangsan", 20);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        oops.writeObject(studentArrayList);
        oops.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\d.txt"));

        while (true) {
            try {
                Object o1 =  ois.readObject();
                System.out.println(o1);
            } catch (EOFException e) {
                break;
            }
        }
        ois.close();

    }
}
