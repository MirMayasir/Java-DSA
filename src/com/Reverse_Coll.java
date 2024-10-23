package com;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_Coll {
    public static void reverse(Integer arr[])
    {
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }
    public static void main(String[] args) {
        Integer arr[] ={1,2,3,4,5,6};
        reverse(arr);
    }
}
