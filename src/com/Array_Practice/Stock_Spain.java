package com.Array_Practice;

public class Stock_Spain {
    public static void spain(int arr[], int temp[])
    {
        int n = arr.length;
        temp[0] = 1;
        for(int i=1; i<n; i++)
        {
            temp[i] = 1;
            for(int j=i-1; (j>=0) && (arr[i]>=arr[j]); j--)
            {
                temp[i]++;
            }
        }
    }
    public static void print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];
        spain(price,S);
        print(S);
    }
}
