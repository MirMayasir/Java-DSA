package com;

public class delete_nth_node {
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
    public Node removeNthNode(Node head, int n)
    {
        if(head.next==null)
        {
            return null;
        }
        int size = 0;
        Node currNode = head;
        while(currNode!=null)
        {
            currNode=currNode.next;
            size++;
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
    public static void main(String[] args) {
        delete_nth_node dn = new delete_nth_node();
        dn.addList(1);
        dn.addList(2);
        dn.addList(3);
        dn.addList(4);
        dn.addList(5);
        dn.printList();
        dn.removeNthNode(dn.head,3);
        dn.printList();
    }
}
