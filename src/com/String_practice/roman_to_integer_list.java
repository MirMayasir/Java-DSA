package com.String_practice;

import java.util.*;
import java.util.Stack;

public class roman_to_integer_list
{
    public static List<Integer> roman(String str)
    {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = map.get(str.charAt(str.length()-1));
        for(int i= str.length()-2; i>=0; i--)
        {
            if(map.get(str.charAt(i)) < map.get(str.charAt(i+1)))
            {
                result -= map.get(str.charAt(i));
            }
            else
                result += map.get(str.charAt(i));
        }
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[map.size()];
        int i = 0;
        while(result != 0)
        {
            int rem = result%10;
            result = result/10;
            arr[i++] = rem;
        }
        for(int j=arr.length-1; j>=0; j--)
        {
            if(arr[j]==0)
            {
                continue;
            }
            else
            {
                list.add(arr[j]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(roman(str));

    }
}
