package com;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_Traversals {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree
    {
        public static int index = -1;
        public static Node buildTree(int nodes[])
        {
            index++;
            if(nodes[index]==-1)
            {

                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public static void preorderTraversal(Node root)
        {
            if(root == null)
            {
                return;
            }
            System.out.println(root.data);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        public static void inorderTraversal(Node root)
        {
            if (root == null)
            {
                return;
            }
            inorderTraversal(root.left);
            System.out.println(root.data);
            inorderTraversal(root.right);
        }
        public static void postorderTraversal(Node root)
        {
            if(root==null)
            {
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.println(root.data);
        }
        public static void levelOrderTraversal(Node root)
        {
            if(root==null)
            {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node currNode = q.remove();
                if(currNode==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else
                    {
                        q.add(null);
                    }
                }
                else
                {
                    System.out.print(currNode.data);
                    if(currNode.left != null)
                    {
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null)
                    {
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static int countNodes(Node root)
        {
            if(root == null)
            {
                return 0;
            }
            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);
            return leftCount+rightCount+1;
        }
        public static int sumNodes(Node root)
        {
            if(root == null)
            {
                return 0;
            }
            int leftSum = sumNodes(root.left);
            int rightSum = sumNodes(root.right);
            return leftSum+rightSum+root.data;
        }
        public static int height(Node root)
        {
            if(root == null)
            {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int myHeight = Math.max(leftHeight,rightHeight)+1;
            return myHeight;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //tree.preorderTraversal(root);
        //tree.inorderTraversal(root);
        //tree.postorderTraversal(root);
        //tree.levelOrderTraversal(root);
        //System.out.println(tree.countNodes(root));
        //System.out.println(tree.sumNodes(root));
        System.out.println(tree.height(root));
    }
}
