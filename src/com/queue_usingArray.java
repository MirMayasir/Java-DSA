package com;
public class queue_usingArray {
   static class queue
   {
       static int arr[];
       static int rear = -1;
       static int size;
       queue(int n)
       {
           this.size = n;
           arr = new int [n];
       }
       public static boolean isEmpty()
       {
           return rear == -1;
       }
       public static void add(int data)
       {
           if(rear == size-1)
           {
               return;
           }
           rear++;
           arr[rear] = data;
       }
       public static int remove()
       {
           if(isEmpty())
           {
               return -1;
           }
           int front = arr[0];
           for(int i=0; i<rear; i++)
           {
               arr[i] = arr[i+1];
           }
           rear--;
           return front;
       }
       public static int peek()
       {
           if(isEmpty())
           {
               return -1;
           }
           return arr[0];
       }

   }
    public static void main(String[] args) {
       queue q = new queue(5);
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);

       while(!q.isEmpty())
       {
           System.out.println(q.peek());
           q.remove();
       }
    }
}
