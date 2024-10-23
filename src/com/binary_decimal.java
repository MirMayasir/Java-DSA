package com;
import java.util.*;
public class binary_decimal {
    public static void decimalToBinary(int number)
    {
        int binary [] = new int[5];
        int i = binary[0];
        while(number >0)
        {
            binary[i] = number%2;
           // System.out.println(binary[i]);
            number = number/2;
            i++;
        }
        for(int j=binary.length-1; j>=0; j--)
        {
            System.out.println(binary[j]);
        }

    }
    public static int binaryToDecimal(int num)
    {
        System.out.println("start");
        int reminder;
        int decimal=0;
        int i=0;
        while(num!=0)
        {
            reminder = num%10;
            num=num/10;
            decimal += reminder * Math.pow(2,i);
            ++i;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        //decimalToBinary(number);
        //int z = binaryToDecimal(num);
        System.out.println("the conversion is " + binaryToDecimal(num));

    }
}



