package com.String_practice;

import java.util.Arrays;

public class Longest_Common_Prefix {
    public static String lcp(String s1, String s2, String s3, String s4)
    {
        int end = Math.min(Math.min(s1.length(),s2.length()),Math.min(s3.length(),s4.length()));
        String result = " ";
        for(int i=0; i<end; i++)
        {
            if(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i) &&
            s3.charAt(i) == s4.charAt(i))
            {
                result += s1.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
    String s1 = "geek";
    String s2 = "geeks";
    String s3 = "geek";
    String s4 = "geekszer";
        System.out.println(lcp(s1,s2,s3,s4));
    }
}
