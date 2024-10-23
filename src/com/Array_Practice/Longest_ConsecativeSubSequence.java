package com.Array_Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Longest_ConsecativeSubSequence {
    public static int longestSubsequence(int arr[])
    {
        Arrays.sort(arr);
        int size = 0;
        int ans = 0;
        for(int i=0; i<arr.length-1; i++)
        {
            if((arr[i]+1) == arr[i+1])
            {
                size++;
            }
            else
                size = 1;
            ans = Math.max(size,ans);
        }
        return ans;
    }
    public static void main(String[] args) {
    int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        System.out.println(longestSubsequence(arr));
    }
}
