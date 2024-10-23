package com.Array_Practice;

public class Pair_Sum {
    public static int pairSum(int arr[], int sum)
    {
        int count = 0;
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == sum)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        int sum = 11;
        System.out.println(pairSum(arr,sum));
    }
}
