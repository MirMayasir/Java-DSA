package com.String_practice;

public class Panagram_String {
    public static boolean isPanagram(String s)
    {
        if(s.length()<26)
        {
            return false;
        }
        for(char c = 'a'; c<='z'; c++)
        {
            if(s.indexOf(c)<0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the dog";
        System.out.println(isPanagram(str));
    }
}
