package com;

public class GFG_A1 {
    public static void subArray(int arr[], int sum)
    {
        int currSum = arr[0];
        int start = 0;
        for(int i=1; i<arr.length; i++)
        {
            while(currSum>sum && start<i-1)
            {
                currSum = currSum-arr[start];
                start++;
            }
            if(currSum == sum)
            {
                int p = i-1;
                System.out.println("the start index is from " + start + " to " + p);
            }
            if(i<sum)
            {
                currSum = currSum + arr[i];
            }
        }
        System.out.println("no subarray");
    }
    public static void main(String[] args) {
        int arr[] = {1, 4};
        int sum = 0;
        //System.out.println(subArray(arr,sum));
        subArray(arr,sum);
    }
}
