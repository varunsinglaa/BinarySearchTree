import java.util.*;
	public class BinarySearchTree
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
    BinarySearchTree()
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

	void inorder()
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
		BinarySearchTree b=new BinarySearchTree();
	    b.insert(60);
	        b.insert(20);
	        b.insert(10);
	        b.insert(40);
	        b.insert(70);
	        b.insert(60);
	        b.insert(80);
	        b.inorder();
	        b.preorder();
	        b.postorder();
	}
	}

