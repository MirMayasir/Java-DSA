package com.Array_Practice;

public class Rotate_Array {
    public static void rotate(int arr[])
    {
        int x = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    }
    public static void print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotate(arr);
        print(arr);
    }
}
