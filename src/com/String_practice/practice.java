package com.String_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class practice
{
    public static String duplicate(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++)
        {
            map.put(str.charAt(i),1);
        }
        String result = "";
        for(Map.Entry<Character,Integer> e : map.entrySet())
        {
            result += e.getKey();
        }
        return result;
    }

    public static void main(String[] args)
    {
        String str = "cbacdcbc";
        //System.out.println(duplicate(str));
        int arr[] = {1,2,5,6,8,3};
        int pos = Arrays.binarySearch(arr,6);
        System.out.println(pos);
    }

}
