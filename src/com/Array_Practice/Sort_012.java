package com.Array_Practice;
public class Sort_012 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int temp[] = new int[arr.length+1];
        int x = 0;
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > -1 && arr[i] < 1)
            {
                zero++;
            }
            else if(arr[i] > 0 && arr[i] < 2 )
            {
                one++;
            }
            else
            {
                two++;
            }
            x++;
        }
        x = 0;
        System.out.println("No of zeros are = " + zero);
        System.out.println("No of ones are = " + one);
        System.out.println("No of two are = " + two);
        while(zero > 0)
        {
            temp[x++] = 0;
            zero--;
        }
        while(one > 0)
        {
            temp[x++] = 1;
            one--;
        }
        while (two > 0)
        {
            temp[x++] = 2;
            two--;
        }
        for(int i=0; i<temp.length-1; i++)
        {
            System.out.print(temp[i] + " ");
        }
    }
}
