package com;
public class subsequences_recursion {
    public static int countPth(int i, int j, int n, int m)
    {
        if(i==n || j==m)
        {
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        // down movement
        int downPath = countPth(i+1,j,n,m);

        // rightwards moment
        int rightPath = countPth(i,j+1,n,m);

        return downPath+rightPath;
    }
    public static void main(String[] args) {
    int n=3, m=3;
    int totalPath = countPth(0,0,n,m);
        System.out.println(totalPath);
    }
}
