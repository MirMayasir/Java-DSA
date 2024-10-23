package com;

import java.util.Locale;
import java.util.Stack;

public class Dindora {
    public static boolean isPalindrome(String str)
    {
        Stack<Character> s = new Stack<>();
        boolean pal = false;
        for(int i=0; i<str.length(); i++)
        {
            s.push(str.charAt(i));
        }
        for(int i=0; i<s.size(); i++)
        {
            char ch = ' ';
            if(str.charAt(i) == s.pop())
            {
                pal = true;
            }
            else
            {
                pal = false;
                break;
            }
        }
        return pal;
    }
    public static void main(String[] args) {
        String s = "radaR";
        System.out.println(isPalindrome(s));

    }
}
