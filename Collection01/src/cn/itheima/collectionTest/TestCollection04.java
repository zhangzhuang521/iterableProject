package cn.itheima.collectionTest;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection04 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");

        arrayList.add(1,"bb");
        System.out.println(arrayList);
        arrayList.set(0,"aa");
        System.out.println(arrayList);
        arrayList.remove("bb");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        String s = arrayList.get(3);
        System.out.println(s);
        boolean d = arrayList.contains("d");
        System.out.println(d);


    }
}
