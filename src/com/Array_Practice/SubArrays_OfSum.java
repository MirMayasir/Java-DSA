package com.Array_Practice;

public class SubArrays_OfSum {
    public static int arraySum(int arr[], int size, int sum)
    {
        int currSum = arr[0], start = 0, i;
        for(i=1; i<arr.length; i++)
        {
            while(currSum > sum && start < i-1)
            {
                currSum = currSum - arr[start];
                start++;
            }
            if(currSum == sum)
            {
                int p = i-1;
                System.out.println("the indices are " + start + " to " + p);
                return 1;
            }
            if(i<sum)
            {
                currSum = currSum+arr[i];
            }
        }
        System.out.println("no subarray found");
        return 0;
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int n = arr.length;
        int sum = 33;
        arraySum(arr,n,sum);
    }
}
