package com.Array_Practice;

public class Rearrange_NegPos
{
    public static int[] rearrange(int arr[])
    {
        int temp[] = new int[arr.length+3];
        int pos = 0;
        int neg = 1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] >= 0)
            {
                temp[pos] = arr[i];
                pos+=2;
            }
            else
            {
                temp[neg] = arr[i];
                neg+=2;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
      int arr[] = {1, 2, 3, -4, -1, 4};
      int arr2[] = rearrange(arr);
      for(int i=0; i<arr2.length; i++)
      {
          System.out.print(arr2[i] + " ");
      }
    }
}
