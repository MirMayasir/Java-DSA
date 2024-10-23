package com;

public class GFG_A10 {
    public static void equlabrium(int arr[])
    {
        int n = arr.length;
        for(int i=1; i<n; i++)
        {
            int leftSum = 0;
            for(int j=0; j<i; j++)
            {
                leftSum += arr[j];
            }
            int rightSum = 0;
            for(int k=i+1; k<n; k++)
            {
                rightSum += arr[k];
            }
            if(leftSum==rightSum)
            {
                System.out.println(i);
                break;
            }
        }
    }
    public static int equlibrium2(int arr[])
    {
        int n = arr.length;
        int sum = 0;
        int leftSum = 0;
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
        }
        for(int i=0; i<n; i++)
        {
            sum -= arr[i];
            if(sum==leftSum)
            {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0} ;
        //equlabrium(arr);
        System.out.println(equlibrium2(arr));
    }
}
