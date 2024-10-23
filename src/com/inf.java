package com;

public class inf {
    public static void main(String[] args) {
        int n = 123456;
        int sum = 0;
        int rem = 0;
        int i = 0;
        int count = 2;
        while(n>0)
        {
            rem = n%10;
            sum += rem;
            i++;
            if(i>=3)
            {
                break;
            }
            n=n/10;
        }
        System.out.println(sum);
    }
}

