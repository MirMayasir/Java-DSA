package com;

public class Binary_Search {
    public static int binarySearch(int arr[], int low, int high, int element)
    {
        while(high>=low)
        {
            int mid = low + (high-low)/2;
            if(arr[mid] == element)
            {
                return mid;
            }
            if(arr[mid] < element)
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
        int arr[] = {10,20,30,40,50,60,100,200,300};
        int size = arr.length;
        int result = binarySearch(arr,0,size-1,40);
        if(result ==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("found at " + result);
        }
    }
}
