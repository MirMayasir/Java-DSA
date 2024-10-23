package com;
public class linked_list {
    private int size;
    linked_list()
    {
        size=0;
    }
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data)
    {
         Node newNode = new Node(data);
         if(head==null)
         {
             head=newNode;
             return;
         }
         newNode.next=head;
         head=newNode;
    }
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
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
            System.out.println("list is empty ");
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
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("the list is empty");
            return;
        }
        head=head.next;
        size--;
    }
    public void deleteLast()
    {
        if(head==null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize()
    {
        return size;
    }
    public void reverseList()
    {
        if(head== null || head.next==null)
        {
            return;
        }
        Node prvNode = head;
        Node currNode = head;
        while(currNode!=null)
        {
            Node nextNode = currNode.next;
            currNode.next= prvNode;

            prvNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prvNode;
    }

    public static void main(String[] args) {
     linked_list ll = new linked_list();
     ll.addFirst("is") ;
    ll.addFirst("name");
    ll.addFirst("my");
    ll.addLast("mayasir");
     ll.printList();
     ll.reverseList();
        ll.printList();
        }
    }

