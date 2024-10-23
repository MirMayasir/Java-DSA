package com.Array_Practice;

public class NoOf_Occurences {
    public static int countOccirence(int arr[], int k)
    {
        int size = arr.length;
        int count = 0;
        for(int i=0; i<size; i++)
        {
            if(arr[i] == k)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,5,6,1,7,1,1,8,1};
        int k = 1;
        System.out.println(countOccirence(arr,k));
    }
}
