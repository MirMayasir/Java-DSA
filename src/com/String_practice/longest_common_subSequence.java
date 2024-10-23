package com.String_practice;

public class longest_common_subSequence {
    public static int lcs(char x[], char y[], int m,int n)
    {
        if(n == 0 || m == 0)
        {
            return 0;
        }
        if(x[m-1] == y[n-1])
        {
            return 1 + lcs(x,y,m-1,n-1);
        }
        else
        {
            return max(lcs(x,y,m,n-1),lcs(x,y,m-1,n));
        }
    }
    public static int max(int a, int b)
    {
        return (a>b)? a:b;
    }
    public static void main(String[] args) {
        longest_common_subSequence lsc = new longest_common_subSequence();
        String s1 = "BBABCBCAB";;
        String s2 = new StringBuilder(s1).reverse().toString();
        char x[] = s1.toCharArray();
        char y[] = s2.toCharArray();
        int m = x.length;
        int n = y.length;
        System.out.println(lsc.lcs(x,y,m,n));
    }
}
