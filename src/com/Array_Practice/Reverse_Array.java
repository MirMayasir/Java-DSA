package com.Array_Practice;

public class Reverse_Array {
    public static void reverse1(int arr[])
    {
            int start = 0;
            int end = arr.length-1;
            while(start<=end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }
    public static void printArray(int arr[])
    {
        int size = arr.length;
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " -> ");
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int arr [] = {1,3,2,4,5,3,7};
        System.out.println("the original array is ");
        printArray(arr);
        reverse1(arr);
        System.out.println("reversed array is ");
        printArray(arr);

    }
}
