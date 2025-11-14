//FINDING THE HEIGHT OF THE BINARY TREE

import java.util.*;
public class BinaryTree3 {
	static Scanner sc=new Scanner(System.in);
	public static class Node
	{
		Node left,right;
		int data;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node root=create();
		System.out.println("Root of the tree is: "+root.data);
		int ht=height(root);
		System.out.println("Height of the tree is: "+ht);
	}
	
	public static Node create()
	{
		Node root=null;
		System.out.print("Enter data: ");
		int data=sc.nextInt();
		
		if(data==-1)
		return null;
		
		root=new Node(data);
		
		System.out.println("Enter left data of "+data);
		root.left=create();
		System.out.println("Enter right data of "+data);
		root.right=create();
		return root;
	}
	
	public static int height(Node root)
	{
		if(root==null)
			return 0;
		return Math.max(height(root.left), height(root.right))+1;
	}

}
