package com.Array_Practice;

public class QuickSort_Array {
    // Worst case time complexity ->> o(n^2)
    // Average case time complexity ->> o(nlogn)
    // Worst case is when the pivort is smallest or largest element;
    public static int partation(int arr[], int low, int high)
    {
        int pivort = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++)
        {
            if(arr[j] <= pivort)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivort;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int pIndex = partation(arr, low, high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int i=0; i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
