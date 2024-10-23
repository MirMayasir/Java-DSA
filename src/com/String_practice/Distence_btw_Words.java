package com.String_practice;

public class Distence_btw_Words {
    public static void distance(String s[], String w1, String w2)
    {
        int n = s.length;
        int first = -1;
        int second = -1;
        for(int i=0; i<n; i++)
        {
            if(s[i] == w1)
            {
                first = i;
            }
            if(s[i] == w2)
            {
                second = i;
            }
        }
        int count = 0;
        for(int i=first+1; i<second; i++)
        {
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String s[] = {"the", "quick", "the brown", "quick" ,"brown" ,"the" ,"quick"};
        String w1 = "quick";
        String w2 = "quick";
        distance(s,w1,w2);
    }
}
