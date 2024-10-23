package com.company;
import java.util.*;
public class queue_usingColFram {
    public static void reverse(Queue<Integer> q)
    {
        if(q.isEmpty())
        {
            System.out.println("cant remove");
        }
        int size = q.size();
        for(int i=size; i<0; i--)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
