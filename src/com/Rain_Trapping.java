package com;

import java.util.jar.JarOutputStream;

public class Rain_Trapping {
    //Not an optimal approach -> o(n^3)
    public static int rainTrapping(int[] block)
    {
        int n = block.length;
        int result = 0;
        for(int i=1; i<n-1; i++)
        {
            int left = block[i];
            for(int j = 0; j<i; j++)
            {
                left = Math.max(left,block[j]);
            }
            int right = block[i];
            for(int j=i+1; j<n; j++)
            {
                right = Math.max(right, block[j]);
            }
            result += Math.min(left, right)-block[i];
        }
        return result;
    }
    //Optimal approach -> o(n)
    public static int water(int [] blocks)
    {
        int n = blocks.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int water = 0;
        left[0] = blocks[0];
        for(int i=1; i<n; i++)
        {
            left[i] = Math.max(left[i-1],blocks[i]);
        }
        right[n-1] = blocks[n-1];
        for(int i = n-2; i>=0; i--)
        {
            right[i] = Math.max(right[i+1],blocks[i]);
        }
        for(int i=0; i<n; i++)
        {
            water += Math.min(left[i],right[i])-blocks[i];
        }
        return water;
    }
    public static void main(String[] args) {
     int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(water(arr));
        System.out.println(rainTrapping(arr));
    }
}
