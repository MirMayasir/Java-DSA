package com;

public class stack_oneshort {
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class stack
    {
        public static Node head;
        public static boolean isEmpty()
        {
            return head==null;
        }
        public static void push(int data)
        {
            Node newNode = new Node(data);
            if(isEmpty())
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top = head.data;
            head=head.next;
            return top;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }
        public static void pushAtBottom(int data, stack s)
        {
            if(isEmpty())
            {
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottom(data,s);
            s.push(top);
        }
        public static void reverse(stack s)
        {
            if(s.isEmpty())
            {
                return;
            }
            int top = s.pop();
            reverse(s);
            pushAtBottom(top,s);
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
       // s.reverse(s);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
