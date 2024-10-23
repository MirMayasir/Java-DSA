package com.String_practice;

public class bhavya {
    public static int result(int arr[])
    {
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++)
        {
           if(arr[i] == 0)
           {
               return 0;
           }
           if(arr[i]<0)
           {
               count++;
           }
        }
        return count%2==0 ? 1:-1;
    }
    public static void main(String[] args) {
    int arr[] = {1,-1,-3,-4};
        System.out.println(result(arr));
    }

}
