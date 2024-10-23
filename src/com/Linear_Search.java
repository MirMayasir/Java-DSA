package com;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        //boolean sorted = false;
        int size = 5;
        int arr[] = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of the array");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int key = 20;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==key)
            {
                System.out.println("the index is " + i);
            }
        }

    }
}
