package cn.itheima.collectionTest;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.addFirst("aa");
        linkedList.addLast("ee");
        String first = linkedList.getFirst();
        String last = linkedList.getLast();
        System.out.println(first);
        System.out.println(last);
//        linkedList.removeFirst()
        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
