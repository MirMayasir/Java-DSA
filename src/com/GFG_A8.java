package com;
public class GFG_A8 {
    public static int inversion(int arr[])
    {
        int count = 0;
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length; j++)
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
        if(si>=ei)
        {
            return 0;
        }
        int inv = 0;
        int mid = si+(ei-si)/2;
        inv += divide(arr,si,mid);
        inv += divide(arr,mid+1,ei);
        inv += conqure(arr,si,mid,ei);
        return inv;
    }
    public static int conqure(int arr[], int si, int mid, int ei)
    {
        int index1=si;
        int index2=mid+1;
        int x =0;
        int n=0;
        int merged[] = new int[ei-si+1];
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
        for(int i=0,j=si; i<merged.length; i++,j++)
        {
            arr[j] = merged[i];
        }
        return n;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4 };
        int n = arr.length;
        System.out.println(divide(arr,0,n-1));
    }
}
