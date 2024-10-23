package com.String_practice;

import java.util.HashMap;

public class Isomarphic_String {
    public static boolean isomarphic(String s1, String s2)
    {
        int n = s1.length();
        int m = s2.length();
        if(n!=m)
        {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(map.containsKey(c1))
            {
                if(map.get(c1) != c2)
                {
                    return false;
                }
            }
            else if(map.containsValue(c2))
            {
                return false;
            }
            else
            {
                map.put(c1,c2);
            }
        }
        return true;
    }
    public static void main(String[] args) {
       String s1 = "aabb";
       String s2 = "xxz";
        System.out.println(isomarphic(s1,s2));
    }
}
