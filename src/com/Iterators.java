package com;
import java.util.HashSet;
import java.util.Iterator;
public class Iterators {
    public static void main(String[] args) {
       HashSet<Integer> set = new HashSet<>();
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(3);
       set.add(4);
        System.out.println(set);
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
