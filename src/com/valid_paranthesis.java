package com;

import java.util.Stack;

public class valid_paranthesis {
    public static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        int size = s.length();
        for(int i=0; i<size; i++)
        {
            char x = s.charAt(i);
            if (x == '(' || x == '{' || x == '[')
            {
                stack.push(x);
                continue;
            }
            if(stack.isEmpty())
            {
                return false;
            }
            char check ;
            switch(x)
            {
                case ')' :
                    check =  stack.pop();
                    if(check == '{'|| check == '['){
                        return false;
                    }
                    break;
                case '}' :
                    check = stack.pop();
                    if(check == '(' || check == '[')
                    {
                        return false;
                    }
                    break;
                case ']' :
                    check = stack.pop();
                    if(check == '{' || check == ')')
                    {
                        return false;
                    }
                    break;
            }

        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String c = "({[]})";
        if(isValid(c))
        {
            System.out.println("balanced");
        }
        else
        {
            System.out.println("not balanced");
        }
    }
}
