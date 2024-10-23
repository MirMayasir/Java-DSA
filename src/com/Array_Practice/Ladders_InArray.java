package com.Array_Practice;

public class Ladders_InArray {
    // Not optimal solution ->> o(n^2)
    public static void ladder(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            int j;
            for(j=i+1; j<n; j++)
            {
                if(arr[i] <= arr[j])
                {
                    break;
                }
            }
            if(j==n)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void ladder2(int arr[])
    {
        int n = arr.length;
        int max = arr[n-1];
        System.out.println(arr[n-1]);
        for(int i=n-2; i>=0; i--)
        {
            if(max < arr[i])
            {
                max = arr[i];
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
      int arr[] = {16, 17, 4, 3, 5, 2};
       ladder2(arr);
    }
}
