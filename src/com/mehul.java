package com;

public class mehul {
    public static String puzzle(String target,String hint)
    {
        int n = target.length();
        int m = hint.length();
        String temp = " ";
        for(int i=0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(hint.charAt(1) == target.charAt(j))
                {
                    temp += hint.charAt(i);
                }
            }
        }
        return temp;
    }
    public static void main(String[] args) {
    String target = "puzzle";
    String hint = "pu#asd#jko#le#zz#zzle";
        System.out.println(puzzle(target, hint));
    }
}
