package com.Array_Practice;

public class Min_Max {
    public static void main(String[] args) {
        int arr[] = {2,4,1,6,8,10,3,5};
        int max = 0;
        int min = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] <= min)
            {
                min = arr[i];
            }
            if(arr[i]>=max)
            {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

}
