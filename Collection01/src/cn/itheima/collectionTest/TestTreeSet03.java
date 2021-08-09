package cn.itheima.collectionTest;

import cn.itheima.domain.Teacher;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet03 {
    public static void main(String[] args) {
        TreeSet<Teacher> teachers = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int result = o1.getAge() - o2.getAge();
                return result == 0 ? o1.getName().compareTo(o2.getName()) : result;
            }
        });
        Teacher teacher1 = new Teacher("wang", 26);
        Teacher teacher2 = new Teacher("zhang", 29);
        Teacher teacher3 = new Teacher("li", 28);
        Teacher teacher4 = new Teacher("wang", 29);
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
        System.out.println(teachers);
    }
}
