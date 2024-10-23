package com;

import java.util.Random;

public class pandora {
    public static void fib(int n)
    {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int c ;
        for(int i=2; i<n; i++)
        {
            c = a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
    }
    public static int fib2(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
            return fib2(n-1) + fib2(n-2);
    }
    public static void prime(int n)
    {
        int temp=0;
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                temp++;
            }
        }
        if(temp>0)
        {
            System.out.println("not prime");
        }
        else
        {
            System.out.println("prime");
        }
    }
    public static void palindrrome(int n)
    {
        int rem,sum=0,temp;
        temp=n;
        while(n>0)
        {
            rem = n%10;
            sum = (sum*10)+rem;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
    public static int factorial(int n)
    {
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static int factorial2(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*factorial2(n-1);
    }
    public static void armstrong(int n)
    {
        int rem ,sum=0,temp;
        temp = n;
        while(n>0)
        {
            rem = n%10;
            sum += rem*rem*rem;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("armstrong");
        }
        else
            System.out.println("not armstrong");
    }
    public static int random()
    {
        Random rm = new Random();
        int n = rm.nextInt(100);
        return n;
    }
    public static void pattern(int n)
    {
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=2*(n-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
    public static void pattern4(int n)
    {
        for(int i=n; i>=0; i--)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void asciiExchange()
    {
        char ch1 = 'a';
        char ch2 = 'b';
        int ch = ch1;
        int chh = ch2;
        System.out.println(ch);
        System.out.println(chh);
    }
    public static void main(String[] args) {
        //System.out.println(random());
        asciiExchange();
    }
}
