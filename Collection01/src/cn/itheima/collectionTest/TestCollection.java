package cn.itheima.collectionTest;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        System.out.println(collection);
        System.out.println("=======");
        collection.add("ddd");
        ((ArrayList<String>) collection).add(1, "bb");
        System.out.println(collection);
        System.out.println("=======");
//        boolean bb = collection.contains("bb");
//        System.out.println(bb);
//        System.out.println("=======");
//        String s = ((ArrayList<String>) collection).get(1);
//        System.out.println(s);
//        System.out.println("=======");
//        boolean empty = collection.isEmpty();
//        System.out.println(empty);
//        System.out.println("=======");
//        boolean aaa = collection.remove("aaa");
//        System.out.println(aaa);
//        System.out.println(collection);
//        System.out.println("=======");
//        String remove = ((ArrayList<String>) collection).remove(1);
//        System.out.println(remove);
//        System.out.println(collection);
//        collection.removeIf(
//                (String S) ->
//             S.length() == 3
//        );
//        System.out.println(collection);
//        int size = collection.size();
//        System.out.println(size);
//        collection.clear();
//        System.out.println(collection);
//        String s = collection.toString();
//        System.out.println(s);
//        String[] objects = (String[]) collection.toArray();
//        System.out.println(objects);
    }
}
