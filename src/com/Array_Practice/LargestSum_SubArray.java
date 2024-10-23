package com.Array_Practice;

public class LargestSum_SubArray {
    public static int largestSum(int arr[])
    {
        int n = arr.length;
        int maxSum = 0;
        for(int i=0; i<n; i++)
        {
            int sum = 0;
            for(int j=i; j<n; j++)
            {
                sum += arr[j];
                if(sum > maxSum)
                {
                    maxSum = sum;
                }
            }

        }
        return maxSum;
    }
    public static int largestSum2(int arr[])
    {
        int n = arr.length;
        int maxSum = 0;
        int currSum = 0;
        for(int i=0; i<n; i++)
        {
            currSum += arr[i];
            if(currSum>maxSum)
            {
                maxSum = currSum;
            }
            if(currSum<0)
            {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(largestSum2(a));
    }
}
