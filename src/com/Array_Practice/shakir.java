package com.Array_Practice;
import java.util.Scanner;

public class shakir {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(sum);
    }
}
