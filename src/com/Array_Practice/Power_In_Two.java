package com.Array_Practice;

public class Power_In_Two {
    public static int power(int arr1[], int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;
        int ans = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(Math.pow(arr1[i], arr2[j]) > Math.pow(arr2[j],arr1[i]))
                {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
      int arr1[] = {10, 19, 18};
      int arr2[] = {11, 15, 9} ;
        System.out.println(power(arr1,arr2));
    }
}
