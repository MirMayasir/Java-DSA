package com.Array_Practice;
public class Min_Element {
    public static int min(int arr[])
    {
        int min = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr1[] =  {5, 6, 1, 2, 3, 4};
        System.out.println(min(arr1));
        int arr2[] =  {1, 2, 3, 4};
        System.out.println(min(arr2));
    }
}
