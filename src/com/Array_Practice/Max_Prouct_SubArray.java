package com.Array_Practice;

public class Max_Prouct_SubArray {
    public static int maxProduct(int arr[])
    {
       int result = arr[0];
       int n = arr.length;
       for(int i=0; i<n; i++)
       {
           int mul = arr[i];
           for(int j=i+1; j<n; j++)
           {
               result = Math.max(result, mul);
               mul *= arr[j];
           }
           result = Math.max(result, mul);
       }
       return result;
    }
    public static void main(String[] args) {
        int arr[] = {-1, -3, -10, 0, 60};
        System.out.println(maxProduct(arr));
    }
}
