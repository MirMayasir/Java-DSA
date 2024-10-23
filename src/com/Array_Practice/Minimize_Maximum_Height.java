package com.Array_Practice;

import java.util.Arrays;

public class Minimize_Maximum_Height {
    public static int minimize(int arr[], int k)
    {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = arr[n-1] - arr[0];
        int tempmin = arr[0];
        int tempmax = arr[n-1];
        for(int i=1; i<n; i++)
        {
            if(arr[i]-k < k)
            {
                continue;
            }
            tempmin = Math.min(arr[0]+k, arr[i]-k);
            tempmax = Math.max(arr[i-1]+k, arr[n-1]-k);
            ans = Math.min(ans,tempmax-tempmin);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        System.out.println(minimize(arr,k));
    }
}
