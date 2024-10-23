package com.Array_Practice;

public class Sorting_array {
    public static void sort(int arr[])
    {
        int size = arr.length;
        int temp = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {8,1,2,7,4,3,5,6};
        sort(arr);
    }
}
