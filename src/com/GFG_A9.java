package com;

public class GFG_A9 {
    public static void sort(int arr[])
    {
        int n = arr.length;
        int zero =0;
        int one =0;
        int two = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]<=0)
            {
                zero++;
            }
            else if(arr[i]>0 && arr[i]<=1)
            {
                one++;
            }
            else
            {
                two++;
            }
        }
        int array[] = new int[n];
        int x =0;
        while(zero!=0)
        {
            array[x++] = 0;
            zero--;
        }
        while(one!=0)
        {
            array[x++] = 1;
            one--;
        }
        while(two!=0)
        {
            array[x++] = 2;
            two--;
        }
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort(arr);

    }
}
