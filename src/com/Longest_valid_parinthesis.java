package com;
import java.util.Stack;
public class Longest_valid_parinthesis {
    public static int valid(String s)
    {
        int size = s.length();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int result = 0;
        for(int i=0; i<size; i++)
        {
            if(s.charAt(i) == '(')
            {
                stack.push(i);
            }
            else
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
                if(!stack.isEmpty())
                {
                    result = Math.max(result, i-stack.peek());
                }
                else
                {
                    stack.push(i);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "(()()()";
        System.out.println(valid(s));
    }
}
