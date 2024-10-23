package com.Array_Practice;

public class Union_Intersection {
    public static void intersection(int arr1[], int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
    public static void union(int arr1[] , int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(arr1[i] < arr2[j])
            {
                System.out.println(arr1[i++]);
            }
            else if(arr2[j] < arr1[i])
            {
                System.out.println(arr2[j++]);
            }
            else
            {
                System.out.println(arr2[j++] + " ");
            }
            i++;
        }
        while(i<n)
        {
            System.out.println(arr1[i++] + " ");
        }
        while(j<m)
        {
            System.out.println(arr2[j++] + " ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,3,4,4};
        int arr2[] = {1,3,4,5,6};
       union(arr1,arr2);
        //intersection(arr1,arr2);
    }
}
