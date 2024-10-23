package com;
import java.util.ArrayList;
import java.util.Collections;

public class array_list {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        // add elements
        list.add("mayasir");
        list.add("ayush");
        list.add("abhilash");
        list.add("mehul");
        System.out.println(list);

        //get element
        String name = list.get(1);
        System.out.println(name);

        //ADD IN BETWEEN
        list.add(1,"sehaj");
        System.out.println(list);

        // DELETE ELEMENT
        list.remove(1);
        System.out.println(list);

        //size of the arraylist
        int size = list.size();
        System.out.println("the size of the array list is : " + size);

        //loops
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
