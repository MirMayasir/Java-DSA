package com.Array_Practice;

public class Max_Sum_Configuration {
    public static int maxSum(int arr[])
    {
        int n = arr.length;
        int maxSum = 0;
        for(int i=0; i<n; i++)
        {
            int currSum = 0;
            for(int j=0; j<n; j++)
            {
                int index = (i+j)%n;
                currSum += j*arr[index];
            }
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {8, 3, 1, 2};
        System.out.println(maxSum(arr));
    }
}
