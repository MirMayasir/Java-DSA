package com.Array_Practice;

import java.util.*;

public class SubArray_WithSumZero {
    public static boolean isZero(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            int currSum = 0;
            for(int j= i; j<n; j++)
            {
                currSum += arr[j];
                if(currSum==0)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isZero2(int arr[])
    {
        int n = arr.length;
        Set<Integer> hs = new HashSet<>();
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
            if(arr[i] == 0 || sum == 0 || hs.contains(sum))
            {
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] =  {4, 2, -3, 1, 6};
        System.out.println(isZero2(arr));
    }
}
