package com;

public class GFG_A6 {
    public static void rearrange(int arr[])
    {
        int n = arr.length;
        int arrange[] = new int[n];
        int start = 0;
        int end = n-1;
        int x = 0;
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                arrange[x++] = arr[end--];
            }
            else
            {
                arrange[x++] = arr[start++];
            }
        }
        for(int i=0; i<arrange.length; i++)
        {
            System.out.print(arrange[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6} ;
        rearrange(arr);
    }
}
