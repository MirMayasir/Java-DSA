package com.Array_Practice;

import java.util.Arrays;

public class Inversion_Of_Array {
    public static int inversion(int arr[])
    {
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static int divide(int arr[], int si, int ei)
    {
        int count = 0;
        if(si<ei)
        {
            int mid = (si+ei) / 2;
            count += divide(arr, si, mid);
            count += divide(arr, mid + 1, ei);
            count += conqure(arr, si, mid, ei);
        }
        return count;
    }
    public static int conqure(int arr[], int si, int mid, int ei)
    {
        int left[] = Arrays.copyOfRange(arr,si,mid+1);
        int right[] = Arrays.copyOfRange(arr,mid+1,ei+1);
        int i =0, j=0, swap =0, k=si;
        while(i<left.length && j< right.length)
        {
            if(left[i]<=right[j])
            {
                arr[k++] = left[i++];
            }
            else
            {
                arr[k++] = right[j++];
                swap += (mid+1)-(si+i);
            }
        }
        while(i<left.length)
        {
            arr[k++] = left[i++];
        }
        while(j<right.length)
        {
            arr[k++] = right[j++];
        }
        return swap;
    }
    public static void main(String[] args) {

        int[] arr = {8, 4, 2, 1};
        int n = arr.length;
        System.out.println(divide(arr,0,n-1));
    }
}
