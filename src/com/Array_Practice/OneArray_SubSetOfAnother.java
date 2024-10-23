package com.Array_Practice;

public class OneArray_SubSetOfAnother {
    public static  boolean isSubset(int arr1[], int arr2[])
    {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0;
        int j =0;
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                if(arr2[i] == arr1[j])
                {
                    break;
                }
            }
            if(j==m)
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[] = { 11,13,21,3,7};
        int arr2[] = { 11,3,7,1};
        System.out.println(isSubset(arr1,arr2));
    }
}
