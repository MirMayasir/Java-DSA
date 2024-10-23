package com;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LLmerg {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void merg(LLmerg list2)
    {
        Node pcurr = head, qcurr = list2.head;
        Node pnext,qnext;
        while(pcurr!=null && qcurr!=null)
        {
            pnext = pcurr.next;
            qnext = qcurr.next;

            pcurr.next = qcurr;
            qcurr.next = pnext;


            pcurr = pnext;
            qcurr = qnext;
        }
        list2.head = qcurr;
    }
}

public class Merg_twoLLists_alternatively
{
    public static void main(String[] args) {
        LLmerg l1 = new LLmerg();
        LLmerg l2 = new LLmerg();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(7);

        l2.add(2);
        l2.add(4);
        l2.add(6);
        l1.printList();
        l2.printList();
        l1.merg(l2);
        l1.printList();
        l2.printList();
    }
}
