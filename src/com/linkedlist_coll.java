package com;
import java.util.*;
public class linkedlist_coll {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("is");
        list.addFirst("name");
        list.addFirst("my");

        list.addLast("maysir");
        list.add(1, "hello");
        System.out.println(list);
        int index = list.indexOf("maysir");
        System.out.println(index);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
        Collections.reverse(list);
        System.out.println(list);
    }
}
