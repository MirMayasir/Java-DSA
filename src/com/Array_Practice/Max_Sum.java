package com.Array_Practice;

public class Max_Sum {
    // Not an optimal solution ->> o(n^2)
    public static int maxSum(int arr[])
    {
        int n = arr.length;
        int maxSum = 0;
        for(int i=0; i<n; i++)
        {
            int sum = 0;
            for(int j=i; j<n; j++)
            {
                sum = sum + arr[j];
                if(sum > maxSum)
                {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    // Kadane’s Algorithm
    // Optimal solution ->> o(n)
    public static int maxSum2(int arr[])
    {
        int maxSum = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
            if(sum > maxSum)
            {
                maxSum = sum;
            }
            if(sum < 0)
            {
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSum2(a));
    }
}
