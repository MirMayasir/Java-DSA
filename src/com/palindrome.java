package com;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n,temp = 0, sum=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp=n;
        while(n>0)
        {
            int r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        n=temp;
        if(temp==sum)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }

}
