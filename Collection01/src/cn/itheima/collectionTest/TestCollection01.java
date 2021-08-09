package cn.itheima.collectionTest;

import java.util.*;

public class TestCollection01 {
    public static void main(String[] args) {
//        stringMethod01();
//        IntegerMethod();
        int sum = getSum(10, 11, 12);



    }
    public static int getSum(int...a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }

    private static void IntegerMethod() {
        ArrayList<Integer> collection = new ArrayList<>();
        collection.add(5);
        collection.add(100);
        collection.add(50);
        collection.add(63);

        Collections.reverse(collection);
        System.out.println(collection);
        Collections.sort(collection);
        System.out.println(collection);
    }

    private static void stringMethod01() {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("bbb");
        collection.add("ccc");
        //遍历
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if ("bbb".equals(s)) {
                iterator.remove();
            }
        }
        System.out.println(collection);
    }
}
