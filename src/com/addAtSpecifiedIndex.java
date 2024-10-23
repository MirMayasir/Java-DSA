package com;

public class addAtSpecifiedIndex {
    private int size;
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public int getSize()
    {
        return size;
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
   public void addAtIndex(Node head, int index , int data)
   {
       if(index >= size || index < 0)
       {
           System.out.println("invalid index ");
           return;
       }
       Node newNode = new Node(data);
       size++;
       while(head==null || index ==0)
       {
           newNode.next=head;
           head=newNode;
           return;
       }
       Node currNode = head;
       for(int i=1; i<size; i++)
       {
           if(i==index)
           {
               Node nextNode = currNode.next;
               currNode.next=newNode;
               newNode.next=nextNode;
           }
           currNode=currNode.next;
       }
   }
   public void deleteAtIndex(Node head, int index)
   {
       if(index >= size || index < 0)
       {
           System.out.println("invalid index");
           return;
       }
       if(index == 0)
       {
           head=null;
           return;
       }
       Node currNode = head;
       for(int i=1; i<size; i++)
       {
           if(i==index)
           {
               currNode.next=currNode.next.next;
           }
           currNode=currNode.next;
       }
   }
    public static void main(String[] args) {
        addAtSpecifiedIndex ad = new addAtSpecifiedIndex();
        ad.addList(1);
        ad.addList(2);
        ad.addList(3);
        ad.addList(4);
        ad.printList();
        ad.addAtIndex(ad.head, 2,6);
        ad.printList();
        //ad.deleteAtIndex(ad.head,2);
        //ad.printList();
    }
}
