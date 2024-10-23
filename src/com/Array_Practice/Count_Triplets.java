package com.Array_Practice;

import java.util.Arrays;

public class Count_Triplets {
    public static int countTriplets(int arr[])
    {
        Arrays.sort(arr);
        int count = 0;
        for(int i=arr.length-1; i>=1; i--)
        {
            int low = 0;
            int high = i-1;
            if(arr[low] + arr[high] == arr[i])
            {
                count++;
                low++;
                high--;
            }
            else if(arr[low] + arr[high] < arr[i])
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        System.out.println(countTriplets(A));
    }
}
