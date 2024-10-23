package com.Array_Practice;

public class reverse_array_group {
    public static void reverseGroup(int arr[], int k)
    {
        int n= arr.length;
        for(int i=0; i<n; i+=k)
        {
            int start = i;
            int end = Math.min(i+k-1, n-1);
            while(start<end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;
                start++;
            }
        }
    }
    public static void print(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2,1,2};
        int k = 3;
        reverseGroup(arr,k);
        print(arr);
    }
}
