package com;
import java.util.*;
public class linklist_prob1 {
    node1 head;
    class node1
    {
        int data;
        node1 next;
        node1(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void list(int data)
    {
        node1 newNode = new node1(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        node1 currNode = head;
        while(currNode.next != null)
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
        node1 currNode = head;
        while(currNode!=null)
        {
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public void reverse()
    {
        if(head == null || head.next==null)
        {
            return;
        }
        node1 secondLast = head;
        node1 lastNode = head.next;
        node1 temp = head;
        temp=secondLast;
        secondLast=lastNode;
        lastNode=temp;

    }
    public static void main(String[] args) {
        linklist_prob1 ll = new linklist_prob1();
        ll.list(1);
        ll.list(2);
        ll.list(3);
        ll.list(4);
        ll.printList();
        ll.reverse();
        ll.printList();
}
}
