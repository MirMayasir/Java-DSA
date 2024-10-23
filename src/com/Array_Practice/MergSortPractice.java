package com.Array_Practice;

public class MergSortPractice {
    public static void divide(int arr[], int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int inv = 0;
        int mid = si+(ei-si)/2;
       divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conqure(arr,si,mid,ei);
    }
    public static void conqure(int arr[], int si, int mid, int ei)
    {
        int merged[] = new int[ei-si+1];
        int index1 = si;
        int index2 = mid+1;
        int x =0;
        int n=0;
        while(index1<=mid && index2<=ei)
        {
            if(arr[index1]<=arr[index2])
            {
                merged[x++] = arr[index1++];
            }
            else
            {
                merged[x++] = arr[index2++];
                n=n+(mid+1-index1);
            }
        }
        while(index1<=mid)
        {
            merged[x++] = arr[index1++];
        }
        while(index2<=ei)
        {
            merged[x++] = arr[index2++];
        }
        for(int i=0, j=si; i<merged.length; i++,j++)
        {
            arr[j] = merged[i];
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4};
        int si=0;
        int ei=arr.length-1;
        //System.out.println(divide(arr,si,ei));

    }
}
