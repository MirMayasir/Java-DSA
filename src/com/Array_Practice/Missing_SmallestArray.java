package com.Array_Practice;

import java.util.Arrays;

public class Missing_SmallestArray {
    public static void missing(int arr[])
    {
        Arrays.sort(arr);
        int n = arr.length;
        int x = 1;
        for(int i=0; i<n; i++)
        {
            if(arr[i] <= 0)
            {
                continue;
            }
            else if(x == arr[i])
            {
                x++;
                if(arr[i] == arr[n-1])
                {
                    System.out.println(x);
                    break;
                }
            }
            else
            {
                System.out.println(x);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 0, 10, 2, -10, -20 };
        missing(arr);
    }
}
