package com.Array_Practice;

import java.util.HashMap;

public class Majority_Element {
    // Not optimal solution ->> o(n^2)
    public static void majorityElement(int arr[])
    {
        int maxCount = 0;
        int index = -1;
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                {
                    count++;
                }
                if (count > maxCount)
                {
                    maxCount = count;
                    index = i;
                }
            }
        }
        if(maxCount > arr.length/2)
        {
            System.out.println(arr[index]);
        }
        else
        {
            System.out.println("no element found");
        }
    }
    // Optimal solution ->>o(nlogn)
    public static void majorityElement2(int arr[])
    {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(arr[i]))
            {
                int count = map.get(arr[i])+1;
                if(count > n/2)
                {
                    System.out.println(arr[i]);
                    return;
                }
                else
                {
                    map.put(arr[i],count);
                }
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        System.out.println("no element found");
    }
    //Efficient solution ->> o(n)
    public static void majorityElement3(int arr[])
    {
        int n = arr.length;
        int index = 1;
        int count = 1;
        for(int i=1; i<n; i++)
        {
            if(arr[i] == arr[index])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count == 0)
            {
                index = i;
                count = 1;
            }
        }
        System.out.println(arr[index]);
    }
    public static void main(String[] args) {
        int arr[] =  {3, 3, 4, 2, 4, 4, 2, 4};
        majorityElement2(arr);
    }
}
