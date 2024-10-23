package com.Array_Practice;

public class Remove_duplicate
{
    // Remove duplicate from sorted array ->> o(n);
    public static void duplicate(int arr[])
    {
        sort(arr);
        int x = 0;
        int temp[] = new int[arr.length];
        for(int i=0; i<arr.length-1; i++)
        {
               if (arr[i] != arr[i+1])
                {
                    temp[x] = arr[i];
                    x++;
                }
        }
        temp[x] = arr[arr.length-1];
        for(int i=0; i<=x; i++)
        {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
    public static void sort(int arr[])
    {
        int temp =0;
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
        duplicate(arr);
    }
}
