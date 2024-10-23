package com;
public class quick_sort {
    public static int partation(int arr[], int low, int high)
    {
        int pivort = arr[high];
        int i=low-1;
        for(int j=low; j<high; j++)
        {
            if(arr[j]<=pivort)
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
            int pindex = partation(arr,low,high);
            quickSort(arr,low,pindex-1);
            quickSort(arr,pindex+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,7,1,5,4,8,9};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
