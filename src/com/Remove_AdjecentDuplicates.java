package com;

import java.util.Stack;

public class Remove_AdjecentDuplicates {
   public static String duplicate(String str)
   {
       int n = str.length();
       int i =0;
       Stack<Character> stack = new Stack<>();
       while(i<n)
       {
           if(stack.isEmpty() || str.charAt(i) != stack.peek())
           {
               stack.push(str.charAt(i));
           }
           else
           {
               stack.pop();
           }
           i++;
       }
       String ans = "";
       if(stack.isEmpty())
       {
           return "";
       }
       else
       {
           while(!stack.isEmpty())
           {
               ans = stack.peek() + ans;
               stack.pop();
           }
       }
       return ans;
   }

    public static void main(String[] args) {
        String str = "aabbccdd";
        System.out.println(duplicate(str));
    }
}
