package com.Array_Practice;

import java.util.Arrays;

public class Kth_SmallestNumber
{
    // Not an optimal approach ->> o(n^2)
    public static int sortArray(int arr[], int k)
    {
        int size = arr.length;
        int temp = 0;
        for(int i=0; i<size-1; i++)
        {
            for(int j = i+1; j<size; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[k-1];
    }
    public static void conqure(int arr[], int si, int ei, int mid)
    {
        int merg[] = new int[ei-si+1];
        int index1 = si;
        int index2 = mid+1;
        int x = 0;
        while(index1<=mid && index2 <= ei)
        {
            if(arr[index1] <= arr[index2])
            {
                merg[x++] = arr[index1++];
            }
            else
            {
                merg[x++] = arr[index2++];
            }
        }
        while(index1 <= mid)
        {
            merg[x++] = arr[index1++];
        }
        while(index2 <= ei)
        {
            merg[x++] = arr[index2++];
        }
        for(int i=0, j=si; i<merg.length; i++,j++)
        {
            arr[j] = merg[i];
        }
    }
    public static void divide(int arr[], int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid = si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conqure(arr,si,ei,mid);
    }
    public static void main(String[] args) {
        int arr[] = { 12, 3, 5, 7, 19 };
        divide(arr,0,4);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("reverse list is ");
        int k = 2;
        System.out.println(arr[k-1]);
    }
}
