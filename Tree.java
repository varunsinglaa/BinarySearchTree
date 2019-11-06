import java.util.*;
	public class Tree
	 {
	   static class Node
	  {
	   int data;
	   Node left, right;
	     public Node(int data)
	       {
	             this.data=data;
	             left=right=null;
	       }
	}
	Node root;
    
        Tree()
         {  
            root = null;  
         }
	void insert(int data)
	{
	  root = insertRec(root, data);
	}

	     Node insertRec(Node root, int data)
	{
	   if(root == null)
	{
	   root = new Node(data);
	    return root;
	}
	 if (data < root.data) 
	            root.left = insertRec(root.left, data); 
	        else if (data > root.data) 
	            root.right = insertRec(root.right, data); 
	        return root; 
	    } 

	void inorder(int data)
	{


	}


	void postorder()
	{


	}
	void preorder()
	{


	}
	public static void main(String [] args)
	{
	Tree bst = new Tree();
	Node root = new Node(5);
	}
	}

