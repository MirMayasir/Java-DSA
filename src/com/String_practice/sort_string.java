package com.String_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;

public class sort_string {
    public static String sortString(String str)
    {
        ArrayList<Character> list = new ArrayList<>();
        int n = str.length();
        for (int i = 0; i < n; i++)
        {
            list.add(str.charAt(i));
        }
        Collections.sort(list);
        String s = " ";
        for(int i=0; i<list.size(); i++)
        {
            s += list.get(i);
        }
        String m = " ";
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(m.indexOf(ch)==-1)
            {
                m += ch;
            }
        }
        String res = " ";
        for(int i=m.length()-1; i>=0; i--)
        {
            res += m.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "aabccab";
        System.out.println(sortString(str));
        //sortString(str);

    }
}
