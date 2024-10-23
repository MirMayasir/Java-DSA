package com.String_practice;

import java.util.HashMap;

public class K_Anagram_Strings {
    public static boolean kanagram(String s1, String s2, int k)
    {
        int n = s1.length();
        int m = s2.length();
        if(n!=m)
        {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            char c1 = s1.charAt(i);
            map.put(c1,map.getOrDefault(c1,0)+1);
        }
        for(int i=0;i<m; i++)
        {
            char c2 = s2.charAt(i);
            if(map.containsKey(c2) && map.get(c2)>0)
            {
                map.put(c2, map.getOrDefault(c2, 0) - 1);
            }
        }
        int total = 0;
        for(int i : map.values())
        {
            total++;
        }
        if(total <= k)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        String str1 = "eggkf";
        String str2 = "geeks";
        int k = 1;
        System.out.println(kanagram(str1,str2,k));
    }
}
