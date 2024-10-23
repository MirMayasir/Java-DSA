package com.Array_Practice;

public class Equlibirium_PointArray {
    //Not an optimal approach ->>o(n^2)
    public static int equlibrium(int arr[])
    {
        int n = arr.length;
        for(int i =0; i<n; i++)
        {
            int leftSum = 0;
            for(int j=0; j<i; ++j)
            {
                leftSum += arr[j];
            }
            int rightSum = 0;
            for(int j=i+1; j<n; ++j)
            {
                rightSum += arr[j];
            }
            if(rightSum == leftSum)
            {
                return i;
            }
        }
        return -1;
    }
    // Optimal solution ->> o(n)
    public static int equlibrium2(int arr[])
    {
        int n = arr.length;
        int sum = 0;
        int leftSum = 0;
        for(int i=0;i<n; i++)
        {
            sum += arr[i];
        }
        for(int i=0; i<n; i++)
        {
            sum -= arr[i];
            if(leftSum == sum)
            {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(equlibrium2(arr));

    }
}
