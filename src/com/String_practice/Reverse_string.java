package com.String_practice;

public class Reverse_string {
    public static void reverse1(String str[])
    {
        int n = str.length;
        int start = 0;
        int end  = n-1;
        String temp = "";
        while(start<=end)
        {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
    public static void print(String str[])
    {
        int n= str.length;
        for(int i=0; i<n; i++)
        {
            System.out.print(str[i] + " ");
        }
    }
    public static void reverse2(String str)
    {
        String arr[] = str.split(" ");
        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        //String s[] = {"i" ,"like" ,"this" ,"program", "very", "much" };
        //print(s);
        //System.out.println();
        //reverse(s);
        //print(s);
        String str = "my name is mir mayasir";
        reverse2(str);
    }
}
