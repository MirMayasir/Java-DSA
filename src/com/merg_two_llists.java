package com;
class Node1
{
    int data;
    Node1 next;
    Node1(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class TwoLists
{
    Node1 head;
    public void addList(int data)
    {
        Node1 newNode = new Node1(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node1 currNode = head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printlist()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node1 newNode = head;
        while(newNode!=null)
        {
            System.out.print(newNode.data + " -> ");
            newNode=newNode.next;
        }
        System.out.println("null");
    }
}
public class merg_two_llists{
    public static void main(String[] args) {
     TwoLists l1 = new TwoLists();
     TwoLists l2 = new TwoLists();
     l1.addList(1);
     l1.addList(2);
     l1.addList(3);
     l1.addList(4);

     l2.addList(5);
     l2.addList(6);
     l2.addList(7);
     l2.addList(8);

     l1.printlist();
     l2.printlist();

     l1.head = new mergs().mergLists(l1.head, l2.head);
     l1.printlist();
}
}
class mergs
{
    public Node1 mergLists(Node1 headA1, Node1 headB2)
    {
        Node1 dummyNode1 = new Node1(0);
        Node1 tail1 = dummyNode1;
        while(true)
        {
            if(headA1 == null)
            {
                tail1.next=headB2;
                break;
            }
            if(headB2 == null)
            {
                tail1.next=headA1;
                break;
            }
            if(headA1.data<=headB2.data)
            {
                tail1.next=headA1;
                headA1=headA1.next;
            }
            else
            {
                tail1.next=headB2;
                headB2=headB2.next;
            }
            tail1=tail1.next;
        }
        return dummyNode1.next;
    }
}
