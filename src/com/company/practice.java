package com.company;
import java.util.ArrayList;
import java.util.Stack;
//circular queue using array
public class practice{
   static class Node
   {
       int data;
       Node next;
       int size;
       Node(int n)
       {
           this.size=n;
           this.next=null;
       }
   }
   static class queue
   {
       public static Node head = null;
       public static Node tail = null;
       public static boolean isEmpty()
       {
           return tail == null && head == null;
       }
       public static void add(int data)
       {
           Node newNode = new Node(data);
           if(isEmpty())
           {
               head=tail=newNode;
           }
           tail.next=newNode;
           tail=newNode;
       }
       public static int remove()
       {
           if(isEmpty())
           {
               return -1;
           }
           if(head == tail)
           {
               tail=null;
           }
           int front = head.data;
           head=head.next;
           return front;
       }
       public static int peek()
       {
           if(isEmpty())
           {
               return -1;
           }
           return head.data;
       }
   }
    public static void main(String[] args) {
     queue q = new queue();
     q.add(1);
     q.add(2);
     q.add(3);
     q.add(4);
     q.add(5);

        while (!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
   }
    }

