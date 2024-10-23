package com.Array_Practice;
import java.util.Stack;
public class practice {
    public static int peekElement(int arr[])
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(
                    (mid ==0 || arr[mid] >= arr[mid-1] )&&
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
        int arr[] = {1,3};
        System.out.println(peekElement(arr));
    }
}
