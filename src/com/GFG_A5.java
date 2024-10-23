package com;

import java.util.ArrayList;
import java.util.Arrays;

public class GFG_A5 {
    public static void mergArrays(int arr1[], int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;
        int merg[] = new int[n+m];
        int x =0;
        for(int i=0; i<n; i++)
        {
            merg[x++] = arr1[i];
        }
        for(int j=0; j<m; j++)
        {
            merg[x++] = arr2[j];
        }
        Arrays.sort(merg);
        for(int i=0; i<merg.length; i++)
        {
            System.out.println(merg[i]);
        }
    }
    public static void main(String[] args) {
       int arr1[] = { 1, 3, 4, 5};
       int arr2[] = {2, 4, 6, 8};
       mergArrays(arr1,arr2);
    }
}
