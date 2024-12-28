package javaAdvance;

import java.util.LinkedList;

public class JavaLinkList {
    public static void main(String[] args){
        LinkedList<String>linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("orange");
        linkedList.add("pearl");

        linkedList.addFirst("mango");
        linkedList.reversed();
        System.out.println(linkedList);

        linkedList.remove("orange");
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.clear();

        System.out.println(linkedList);
    }
}
