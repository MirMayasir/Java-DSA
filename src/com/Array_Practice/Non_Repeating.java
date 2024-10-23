package com.Array_Practice;
import java.util.*;
public class Non_Repeating {
    // Not an optimal approach ->> o(n^2);
    public static int nonRepeating(int arr[])
    {
        int n = arr.length;
        for(int i= 0; i<n; i++)
        {
            int j;
            for(j=0; j<n; j++)
            {
                if(i!=j && arr[i] == arr[j])
                {
                    break;
                }
            }
            if(j==n)
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static int notRepeating2(int arr[])
    {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i] ,1);
            }
        }
        for(int i=0; i<n; i++)
        {
            if(map.get(arr[i]) == 1)
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 9, 4, 9, 6, 7, 4 };
        System.out.println(notRepeating2(arr));
    }
}
