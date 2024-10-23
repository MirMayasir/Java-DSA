package com.String_practice;

public class Integer_To_Roman {
    public static String integer(int num)
    {
        int codeInt[] = {1000, 900,500,400,100,80,50,40,10,9,5,4,1};
        String codeChar[] = {"M","CM","D","CD","C","XC","L","XL", "X", "IX", "V", "IV", "I"};
        StringBuilder str = new StringBuilder();
        for(int i=0; i<codeInt.length; i++)
        {
           while(num >= codeInt[i])
           {
               str.append(codeChar[i]);
               num -= codeInt[i];
           }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        int number = 35;
        System.out.println(integer(number));
    }
}
