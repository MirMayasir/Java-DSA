package com.Array_Practice;

public class Arranging_PosNeg {
    public static void rearrange(int arr[])
    {
        int n = arr.length;
        int j =0;
        int temp = 0;
        for(int i=0;i<n; i++)
        {
            if(arr[i] < 0)
            {
                if(i!=j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }

        }
    }
    public static void print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4};
        rearrange(arr);
        print(arr);

    }
}
