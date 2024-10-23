package com;

import java.util.Stack;

public class stack_using_collFrm {
    public static void main(String[] args)
    {
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        int s = list.peek();
        System.out.println("the peek elment is " + s);


        while(!list.isEmpty())
        {
            System.out.println(list.peek());
            list.pop();
        }
    }
}
