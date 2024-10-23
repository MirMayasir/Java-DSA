package com;

public class selection_sort {
    public static void main(String[] args) {
        // Time Complexity = O(n^2) -> WHICH IS ALSO NOT A BEST TECHNIQUE
        int arr[] = {100,12,700,40,0,20,30};
        for(int i=0; i<arr.length-1; i++)
        {
            int smallest = i;
                for(int j=i+1; j<arr.length; j++)
                {

                    if (arr[smallest] > arr[j])
                    {
                        smallest = j;
                    }
                }
                int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
