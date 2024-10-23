package com.OOPS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
    public static void frequency(int arr[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        System.out.println("element | frequency");
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + "          " + e.getValue());
        }
    }
    public static void frequency1(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else
            {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println("character | frequency");
        for(Map.Entry<Character, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + "           "+ e.getValue()) ;
        }
    }
    public static int infosys(int n)
    {
        List<Integer> list = new ArrayList<>();
        int rem = 0;
        int i = 0;
        while(n>0)
        {
            rem = n%10;
            n = n/10;
            list.add(rem);
        }
        int sum = 0;
        for(int j=list.size()-1; j>=0; j-=2)
        {
            sum += list.get(j);
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,3,4,5,6,5,4,2,3,4,1};
        String str = "mayasir";
        //frequency1(str);
        int n = 1234;
        System.out.println(infosys(n));
    }
}
