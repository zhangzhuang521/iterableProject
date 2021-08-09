package cn.itheima.collectionTest;

import cn.itheima.domain.Student;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<Student, String> stringTreeMap = new TreeMap<>();

        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 18);

        stringTreeMap.put(s1, "xian");
        stringTreeMap.put(s2, "beijing");
        stringTreeMap.put(s3, "dali");

        stringTreeMap.forEach((student, s) -> System.out.println(student + "    " + s));
//        Set<Map.Entry<Student, String>> entrySet = stringTreeMap.entrySet();
//        for (Map.Entry<Student, String> studentStringEntry : entrySet) {
//            System.out.println(studentStringEntry.getKey().getName()+"   "+studentStringEntry.getKey().getAge()+"   "+studentStringEntry.getValue());
//        }
       Set<Student> students =stringTreeMap.keySet();
       stringTreeMap.forEach(new BiConsumer<Student, String>() {
           @Override
           public void accept(Student student, String s) {

           }
       });

    }
}
