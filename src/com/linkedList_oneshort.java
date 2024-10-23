package com;
import com.company.LList_interview;

import javax.swing.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
// Create a Linked List in Java -- >
public class linkedList_oneshort
{
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
    // To get the size of the Linked List
    public int getSize()
    {
        return size;
    }
    // Add elemente in the Linked List
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
    // Print the Linked List
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
            System.out.print(currNode.data  + " -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    // To reverse the linked List
    public void reverse()
    {
        if(head == null || head.next==null)
        {
            return;
        }
        Node prevNode = head;
        Node currNode = head;
        while(currNode!=null)
        {
            Node nextNode = currNode.next;
            currNode.next=prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    // To remove the nth node from last in Linked List
    public Node removeNthNode(int n)
    {
        if(head.next==null)
        {
            return null;
        }
        int size =0;
        Node currNode = head;
        while(currNode!=null)
        {
            size++;
            currNode=currNode.next;
        }
        if(n==size)
        {
            return head;
        }
        int searchToIndex = size-n;
        Node curr = head;
        int i=1;
        while(i<searchToIndex)
        {
            i++;
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
    // Check whether a Linked List is palindrome or not
    public boolean isPalindrome()
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
        while(temp!=null)
        {
            int element = myStack.pop();
            if(temp.data == element)
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
    // To find the middle element in the Linked List
    public void midele()
    {
        if(head==null || head.next==null)
        {
            System.out.println(head.data);
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    // To delete the middle element of the Linked List -- >
    public void middle()
    {
        if(head == null || head.next == null)
        {
            return;
        }
        Node slow = head;
        Node fast = head;
        Node prev = head;
        while(fast!=null && fast.next!=null)
        {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = slow.next;
    }
    // To detect a cycle in a Linked list
    public boolean isCycle()
    {
        boolean cycle = false;
        if(head==null)
        {
            cycle = false;
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                cycle = true;
            }

        }
        return false;
    }
    // Insert th Node at a particular index in a Linked List
    public void insertAtMiddle(int index, int data)
    {
        if(index > size || index < 0)
        {
            System.out.println("invalid index");
            return;
        }
        size++;
        Node newNode = new Node(data);
        if(index == 0)
        {
            newNode.next = head;
            head = newNode;
        }
        Node currNode = head;
        for(int i=1; i<size; i++)
        {
            if (i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
            }
            currNode = currNode.next;
        }
    }
    // Delete the elements from a particular index in Linked List
    public void deleteIndex(int index)
    {
        if(index > size || index < 0)
        {
            System.out.println("invalid index ");
            return;
        }
        size--;
        if(index ==0 )
        {
            head = head.next;
        }
        Node slow = head;
        Node currNode = head;
        for(int i=1; i<size; i++)
        {
            if(i==index)
            {
                currNode.next = currNode.next.next;
            }
            currNode=currNode.next;
        }
    }
    // To remove the duplicates from a SORTED Linked List
    public void removeDuplicate()
    {
        if(head==null)
        {
            return;
        }
        int arr[] = new int[size];
        int x =0;
        Node currNode = head;
        while(currNode!=null)
        {
            arr[x] = currNode.data;
            x++;
            currNode=currNode.next;
        }
        int a = 0;
        int arr2[] = new int[size];
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr2[a] = arr[i];
                a++;
            }
        }
        arr2[a] = arr[size-1];
        for(int i=0; i<a; i++)
        {
            System.out.print(arr2[i] + " -> ");
        }
        System.out.println("null");
    }
    // Remove duplicate OPTIMAL APPROACH in a linked list -- >
    public void removeDuplicate2()
    {
        if(head == null && head.next==null)
        {
            return;
        }
        Node curr = head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.data == curr.next.data)
            {
                curr.next = curr.next.next;
            }
            curr=curr.next;
        }
    }
    //*
    // Remove the nodes whose sum is equal to 0;
    public Node removeNode(Node head)
    {
        if(head==null)
        {
            return null;
        }
        Node dummy = new Node(0);
        Node currNode = dummy;
        dummy.next=head;
        int prefixSum=0;
        Map<Integer, Node> prefixsumMap = new HashMap<>();
        while(currNode!=null)
        {
            prefixSum += currNode.data;
            if(prefixsumMap.containsKey(prefixSum))
            {
                currNode=prefixsumMap.get(prefixSum).next;
                int sum = prefixSum+currNode.data;
                while(sum!=prefixSum)
                {
                    prefixsumMap.remove(sum);
                    currNode=currNode.next;
                    sum += currNode.data;
                }
                prefixsumMap.get(prefixSum).next = currNode.next;
            }
            else
            {
                prefixsumMap.put(prefixSum,currNode);
            }
            currNode=currNode.next;
        }
        return dummy.next;
    }
    // To find if there is loop in the Linked List
    public boolean isLoop()
    {
        if(head==null)
        {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(fast==slow)
            {
                return true;
            }
        }
        return false;
    }
    // To make a cycle at a specific position in a Linked List
    public void makeCycle(int pos)
    {
        Node newNode = new Node(10);
        Node temp = head;
        int count = 1;
        while(temp.next!=null)
        {
            if(count == pos)
            {
                newNode = temp;
            }
            temp=temp.next;
            count++;
        }
        temp.next=newNode;
    }
    // To remove the cycle in the Linked List
    public void removeCycle()
    {
        if(head==null)
        {
            return;
        }
        Node slow = head;
        Node fast = head;
        do {
            fast=fast.next.next;
            slow=slow.next;
        }while(fast!=slow);
        fast=head;
        while(fast.next!=slow.next)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=null;
    }
    // Reverse the k group of elements in linked list
    public Node reverseKNode(Node head, int k)
    {

        Node currNode = head;
        Node nextNode , prevNode;
        nextNode = prevNode = null;
        int count = 0;
        while(currNode!=null && count < k)
        {
            nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
            count++;
        }
        if(head!=null)
        {
            head.next=currNode;
        }
        count = 0;
        while(count < k-1 && currNode!=null)
        {
            currNode=currNode.next;
            count++;
        }
        if(currNode!=null)
        {
            currNode.next=reverseKNode(currNode.next,k);
        }
        return prevNode;
    }
    // To remove the last occurrence of an element in a linked list
    public Node lastOccurrence(Node head, int x) {
        Node currNode = head;
        Node temp = null;
        while (currNode != null) {
            if (currNode.data == x) {
                temp = currNode;
            }
            currNode = currNode.next;
        }
        if (temp != null && temp.next == null) {
            currNode = head;
            while (currNode.next != temp) {
                currNode = currNode.next;
            }
            currNode.next = null;
        }
        if (temp != null && temp.next != null) {
            temp.data = temp.next.data;
            currNode = temp.next;
            temp.next = temp.next.next;
        }
        return head;
    }
    // Rotate the linked list (K) times;
    public int sizee()
    {
        Node curr = head;
        int n = 0;
        while(curr!=null)
        {
            curr=curr.next;
            n++;
        }
        return n;
    }
    public Node rotete(Node head, int k)
    {
        if(head == null)
        {
            return head;
        }
        int n = sizee();
        int loop = k%n;
        loop = n-loop;
        if(n==1 && loop==n)
        {
            return head;
        }
        int j =0;
        Node temp = head;
        Node firstAddress = head;
        while(temp!=null)
        {
            j++;
            if(j==loop)
            {
                firstAddress = temp.next;
                temp.next=null;
                break;
            }
            temp=temp.next;
        }
        temp = firstAddress;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next=head;
        return firstAddress;
    }
    // Delete N nodes after M elements in linked list
    public void delete(Node head, int N, int M)
    {
        int count = 0;
        Node currNode = head;
        while(currNode!=null && currNode.next!=null)
        {
            count++;
            int x = N;
            if(count == M )
            {
                while(x>0)
                {
                    currNode.next=currNode.next.next;
                    if(currNode.next==null)
                    {
                        return;
                    }
                    count = 0;
                    x--;
                }
                x=N;
            }
            currNode=currNode.next;
        }
    }
    // Delements from a linked list.
    // usinr for loop in the main function we can delete the elements one by one
    public void delete()
    {
        if(head == null)
        {
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node second = head;
        Node last = head.next;
        while(last != null && last.next!=null)
        {
            last=last.next.next;
            second = second.next;
        }
        second.next=null;
    }
    //Delete the elements of a linked list in one short.
    public void del()
    {
        head = null;
    }
    public static void main(String[] args) {
        linkedList_oneshort pr = new linkedList_oneshort();
       pr.addList(1);
        pr.addList(2);
       pr.addList(3);
        pr.addList(4);
        pr.deleteIndex(0);
        pr.printList();



    }
}
