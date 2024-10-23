package com.Array_Practice;

public class Multiple_Missing {
    public static void main(String[] args) {
    {
        int arr[] = {4,3,2,7,8,2,3,1};
        int n = arr.length;
        int register[] = new int[arr[n-1]+1];
        for(int i=0; i<arr.length; i++)
        {
            register[arr[i]] = 1;
        }
        for(int i=arr[0]; i<arr[n-1]; i++)
        {
            if(register[i] == 0)
            {
                System.out.println(i);
            }
        }
    }

}}
