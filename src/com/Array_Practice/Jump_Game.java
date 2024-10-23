package com.Array_Practice;

public class Jump_Game {
    public static int jumps(int arr[])
    {
        int destination = 0;
        int position = 0;
        int jumps = 0;
        for(int i=0; i<arr.length-1; i++)
        {
            destination = Math.max(destination, i+arr[i]);
            if(position == i)
            {
                position = destination;
                jumps++;
            }
        }
        return jumps;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
        System.out.println(jumps(arr));

    }
}
