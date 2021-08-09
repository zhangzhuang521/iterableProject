package cn.itheima.collectionTest;

import cn.itheima.domain.Student;

import java.util.TreeSet;

public class TestTreeSet02 {
    public static void main(String[] args) {
        //自然排序
        TreeSet<Student> students = new TreeSet<>();
        Student student1 = new Student("zhangsan", 18);
        Student student2 = new Student("zhangli", 20);
        Student student3 = new Student("zhangdi", 19);
        Student student4 = new Student("zhangwangji", 18);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        System.out.println(students);
    }
}
