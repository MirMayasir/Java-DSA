package com;
public class GFG_a2 {
    public static int triplets(int arr[])
    {
        int count = 0;
        for(int i=arr.length-1; i>=2; i--)
        {
            int l =0;
            int r = i-1;
            while(l<r)
            {
                if(arr[l]+arr[r]==arr[i])
                {
                    count++;
                    l++;
                    r--;
                }
                else if(arr[l]+arr[r]<arr[i])
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2};
        System.out.println(triplets(arr));
    }
}

