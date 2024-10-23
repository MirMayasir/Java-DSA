package com;
public class circularQueue_UsingArray {
   static class circularQueue
   {
       static int arr[];
       static int size;
       static int rear = -1;
       static int front = -1;
       circularQueue(int n)
       {
           this.size=n;
           arr = new int[n];
       }
       public static boolean isEmpty()
       {
           return rear ==-1 && front==-1;
       }
       public static boolean isFull()
       {
           return (rear+1)%size == front;
       }
       public static void add(int data)
       {
           if(isFull())
           {
               return;
           }
           if(front==-1)
           {
               front=0;
           }
           rear = (rear+1)%size;
           arr[rear] = data;
       }
       public static int remove()
       {
           if(isEmpty())
           {
               return -1;
           }
           int result = arr[front];
           if(rear == front)
           {
               rear = front = -1;
           }
           else
           {
               front = (front+1)%size;
           }
           return result;
       }
       public static int peek()
       {
           if(isEmpty())
           {
               return -1;
           }
           return arr[front];
       }
   }
    public static void main(String[] args) {
       circularQueue cq = new circularQueue(5);
       cq.add(1);
       cq.add(2);
       cq.add(3);
       cq.add(4);
       cq.add(5);
        System.out.println(cq.remove());
        cq.add(10);
        System.out.println(cq.remove());
        cq.add(20);
        System.out.println("lets traverse the cq");
        while(!cq.isEmpty())
        {
            System.out.println(cq.peek());
            cq.remove();
        }
    }
}
