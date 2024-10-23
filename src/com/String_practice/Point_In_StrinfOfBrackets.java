package com.String_practice;

public class Point_In_StrinfOfBrackets {
    public static int point(String s)
    {
        int n = s.length();
        int countClose = 0;
        for(int i=0; i<n; i++)
        {
            if(s.charAt(i) == ')')
            {
                countClose++;
            }
        }
        for(int i=0; i<n; i++)
        {
            if(countClose == i)
            {
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        String str = "))";
        System.out.println(point(str));
    }
}
