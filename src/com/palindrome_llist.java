package com;

import java.util.Stack;

public class palindrome_llist {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addList(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList()
    {
        if(head==null)
        {
            System.out.println("the list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null)
        {
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public Node removeNth(int n)
    {
        if(head.next==null)
        {
            return null;
        }
        int size=0;
        Node curr = head;
        while(curr!=null)
        {
            curr=curr.next;
            size++;
        }
        if(n==size)
        {
            return head.next;
        }
        int indexToSearch = size-n;
        Node prev = head;
        int i=1;
        while(i<indexToSearch)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
    public boolean isPalindrome(Node head)
    {
        Stack<Integer> myStack = new Stack<>();
        boolean status = false;
        Node temp = head;
        while(temp!=null)
        {
            myStack.push(temp.data);
            temp=temp.next;
        }

        temp=head;
        int element;
        while(temp!=null)
        {
            element = myStack.pop();
            if(temp.data==element)
            {
                status = true;
                temp=temp.next;
            }
            else
            {
                status = false;
                break;

            }
        }
        return status;
    }

    public static void main(String[] args) {
        palindrome_llist pr = new palindrome_llist();
        pr.addList(1);
        pr.addList(2);
        pr.addList(1);
        pr.addList(1);
        pr.printList();
        if(pr.isPalindrome(pr.head))
        {
            System.out.println("list is palindrome");
        }
        else
        {
            System.out.println("the list is not palindrome");
        }
    }
    }