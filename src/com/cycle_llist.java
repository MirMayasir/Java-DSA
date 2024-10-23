package com;

public class cycle_llist {
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
        Node curr = head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void printList()
    {
        if(head==null)
        {
            System.out.println("the list is empty");
            return;
        }
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data + " -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public boolean isCycle(Node head)
    {
        boolean cycle = false;
        if(head.next==null)
        {
            cycle = false;
        }
        Node fast = head;
        Node slow = head;
        while(fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow)
            {
                cycle = true;
            }
            else
            {
                cycle = false;
            }
        }
        return cycle;
    }
    public static void main(String[] args) {
        cycle_llist cy = new cycle_llist();
        cy.addList(1);
        cy.addList(2);
        cy.addList(3);
        cy.printList();
        System.out.println(cy.isCycle(cy.head));
    }
}
