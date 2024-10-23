package com.Array_Practice;

public class peek_element {
    // Not an optimal approach ->> o(n)
    public static void peek(int arr[])
    {
        int n = arr.length;
        if(n==1)
        {
            System.out.println(arr[0]);
        }
        if(n==2)
        {
            int x = arr[0]>=arr[1] ? 0:1;
            System.out.println(arr[x]);
        }
        for(int i=1; i<arr.length-1; i++)
        {
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            {
                System.out.println(i);
            }
        }
    }
    // Optimal approach ->> o(logn)
    public static int peek2(int arr[])
    {
            int n = arr.length;
            int low = 0;
            int high = n-1;
            while(low<=high)
            {
                int mid = low + (high-low)/2;
                if(
                (mid ==0 || arr[mid] >= arr[mid-1]) &&
                        (mid == n-1 || arr[mid] >= arr[mid+1]))
                {
                    return mid;
                }
                else if(arr[mid] <= arr[mid+1])
                {
                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 1,3};
       // System.out.println(peek(arr));
        peek(arr);
    }
}
