package com;
import java.util.Scanner;
class reverse
{
    public static int rev()
    {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int r = n%10;
            sum = (sum*10)+r;
            n=n/10;
        }
        return sum;
    }
}
public class reverse_integer {
    public static void main(String[] args) {
        reverse r = new reverse();
        System.out.println(r.rev());
    }
}
