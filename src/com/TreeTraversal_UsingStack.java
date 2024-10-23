package com;

import java.util.*;

public class TreeTraversal_UsingStack {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    static class Binary_Tree
    {
        static int index = -1;
        public static Node BTree(int nodes[])
        {
            index++;
            if(nodes[index]==-1)
            {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = BTree(nodes);
            newNode.right = BTree(nodes);
            return newNode;
        }
       public static void inorderT(Node root)
       {
          if(root == null)
          {
              return;
          }
          Stack<Node> stack = new Stack<>();
          Node curr = root;
          while(curr!=null || stack.size()>0)
          {
              while(curr!=null)
              {
                  stack.push(curr);
                  curr = curr.left;
              }
              curr = stack.pop();
              System.out.print(curr.data + " ");
              curr = curr.right;
          }
       }
        public static List<Integer> onorder(Node root)
        {
            List<Integer> inorder = new LinkedList<>();
            if(root == null)
            {
                return inorder;
            }
            Stack<Node> stack = new Stack<>();
            Node curr = root;
            while(true)
            {
                if(curr!=null)
                {
                    stack.push(curr);
                    curr = curr.left;
                }
                else
                {
                    if(stack.isEmpty())
                    {
                        break;
                    }
                    curr = stack.pop();
                    inorder.add(curr.data);
                    curr = curr.right;
                }
            }
            return inorder;
        }
        public static List<Integer> preorder(Node root)
        {
            List<Integer> preorder = new LinkedList<>();
            if(root == null)
            {
                return preorder;
            }
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while(!stack.isEmpty())
            {
                root = stack.pop();
                preorder.add(root.data);

                if (root.right != null) {
                    stack.push(root.right);
                }
                if (root.right != null) {
                    stack.push(root.left);
                }
            }
            return preorder;
        }
        public static void preorderT(Node root)
        {
            if(root == null)
            {
                return;
            }
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while(!stack.isEmpty())
            {
                Node newNode = stack.peek();
                System.out.print(newNode.data + " ");
                stack.pop();
                if(newNode.right!=null)
                {
                    stack.push(newNode.right);
                }
                if(newNode.left!=null)
                {
                    stack.push(newNode.left);
                }
            }
        }


    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Binary_Tree btree = new Binary_Tree();
        Node root = btree.BTree(nodes);
        System.out.println(root.data);
        btree.inorderT(root);
        System.out.println();
       btree.preorderT(root);

    }
}
