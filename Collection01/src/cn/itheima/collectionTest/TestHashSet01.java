package cn.itheima.collectionTest;

import java.util.HashSet;

public class TestHashSet01 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("c");
        System.out.println(hashSet);
        for (String s : hashSet) {
            System.out.println(s);
        }

    }
}
