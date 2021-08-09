package cn.itheima.collectionTest;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");

        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("---------------");
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("---------------");
        for (String s : arrayList) {
            System.out.println(s);
        }

    }
}
