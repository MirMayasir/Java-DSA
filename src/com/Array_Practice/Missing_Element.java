package com.Array_Practice;

public class Missing_Element {
    public static int missing(int arr[], int n)
    {
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
        }
        int missingElement = totalSum-sum;
        System.out.println("the miss element between " + 0 + " to " + n + " is " );
      return missingElement;
    }
    public static void missingM(int arr[])
    {
        int n = arr.length;
        int register[] = new int[n];
        for(int i : arr)
        {
            register[i] = 1;
        }
        System.out.println("missing elements are");
        for(int i=1; i<register.length; i++)
        {
            if(register[i]==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,1,2,8,3,4,7,10,5,5,4,1,7};
        //int n = 10;
        missingM(arr);
    }
}
