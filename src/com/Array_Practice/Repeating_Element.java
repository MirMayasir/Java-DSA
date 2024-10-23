package com.Array_Practice;
import java.util.*;
public class Repeating_Element
{
    public static void repeating(int arr[])
    {
        HashSet<Integer> set = new HashSet<>();
        int min = -1;
        for(int i=arr.length-1; i>=0; i--)
        {
            if(set.contains(arr[i]))
            {
                min = i;
            }
            else
            {
                set.add(arr[i]);
            }
        }
        if(min != -1)
        {
            System.out.println(arr[min]);
        }
        else
        {
            System.out.println("no repeating eleemnt");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
        repeating(arr);
    }
}
