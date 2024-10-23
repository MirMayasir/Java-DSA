package com.Array_Practice;
import java.util.Arrays;
public class TrippleSum_Target {
    public static void tripple(int arr[], int target)
    {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            int low = i+1, high = n-1;
            while(low<high)
            {
                int current = arr[i] + arr[low] + arr[high];
                if(current == target)
                {
                    System.out.println(arr[i] + " " + arr[low] + " " + arr[high]);
                    break;
                }
                if(current < target)
                {
                    low++;
                }
                if(current > target)
                {
                    high--;
                }
            }
        }

    }
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        int sum = 9;
        tripple(A,sum);
    }
}
