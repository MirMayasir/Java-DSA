package com;
import java.util.*;
public class Stack_UsingQueues {
    static class stack
    {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static void push(int data)
        {
            q2.add(data);
            while(!q1.isEmpty())
            {
                q2.add(q1.peek());
                q1.remove();
            }
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }
        public static int pop()
        {
            if(q1.isEmpty())
            {
                return -1;
            }
            return q1.remove();
        }
        public static int top()
        {
            if(q1.isEmpty())
            {
                return -1;
            }
            return q1.peek();
        }
        public static boolean isEmpty()
        {
            return q1.isEmpty();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty())
        {
            //System.out.println(s.top());
            s.pop();
        }
    }
}