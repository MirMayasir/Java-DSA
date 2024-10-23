package com;
import java.util.*;
public class apnaCollege_exercise {
    public static void fibonacci(int limit)
    {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2; i<=limit; i++)
        {
            int c = a+b;
            a=b;
            b=c;
            System.out.print(c + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit ");
        int limit = sc.nextInt();
        fibonacci(limit);
    }
}
