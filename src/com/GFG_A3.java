package com;
public class GFG_A3 {
    public static int maxSum(int arr[])
    {
        int max = 0;
        for(int i=0; i<arr.length; i++)
        {
            int currSum = 0;
            for(int j=i; j<arr.length; j++)
            {
                currSum += arr[j];
                if(currSum>max)
                {
                    max = currSum;
                }
            }
        }
        return max;
    }
    public static int maxSum2(int arr[])
    {
        int sum = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
            if(sum>max)
            {
                max = sum;
            }
            if(sum < 0)
            {
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(maxSum(arr));
        System.out.println(maxSum2(arr));
    }
}
