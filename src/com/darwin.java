package com;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;*/
import java.util.*;

public class darwin
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
        /*ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int x=0;
        int z = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]%2==0)
            {
                even.add(arr[i]);
            }
            else
            {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd);
        x=0;
        int j=0;
        int temp[] = new int [n];
       for(int i=0; i<= temp.length; i++)
       {
           if(i%2==0)
           {
               if(x== odd.size())
               {
                   break;
               }
               temp[i] = odd.get(x++);
           }
           else
           {
               temp[i] = even.get(j++);
           }
       }
       for(int i=0; i<n; i++)
       {
           System.out.println(temp[i]+ " ");
       }*/
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
