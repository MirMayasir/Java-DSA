package com;

import java.util.Arrays;

public class GFG_A4 {
    public static int missing(int arr[], int n)
    {
        int sum = n*(n+1)/2;
        int currSum = 0;
        for(int i=0; i<arr.length; i++)
        {
            currSum += arr[i];
        }
        return sum-currSum;
    }
    public static void missingM(int arr[])
    {
        int register[] = new int[arr.length];
        for(int i : arr)
        {
            register[i] = 1;
        }
        System.out.println("mising elements are");
        for(int i=1; i<register.length; i++)
        {
            if(register[i]==0)
            {
                System.out.println(i);
            }
        }

    }
    public static void missingMM(int arr[])
    {
        Arrays.sort(arr);
        int n = arr.length;
        int register[] = new int[arr[n-1]+1];
        for(int i=0; i<n; i++)
        {
            register[arr[i]]  = 1;
        }
        System.out.println("missing elements are");
        for(int i = arr[0]; i<arr[n-1]; i++)
        {
            if(register[i]==0)
            {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = { 6, 7, 10, 11, 13 };
        missingMM(arr);
    }
}
