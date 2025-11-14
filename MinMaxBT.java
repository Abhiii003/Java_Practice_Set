import java.util.*;
public class MinMaxBT {
public static Scanner sc=new Scanner(System.in);
	public static class Node{
		Node left,right;
		int data;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node root=create();
		System.out.println("Root is: "+root.data);
		System.out.println("Max value in Binary Tree is: "+MaxValue(root));
		System.out.println("Min value in Binary Tree is: "+MinValue(root));
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
	
	public static int MaxValue(Node root)
	{
		if(root==null)
			return 0;
		int leftMax=MaxValue(root.left);
		int rightMax=MaxValue(root.right);
		return Math.max(Math.max(leftMax, rightMax),root.data);
	}
	
	public static int MinValue(Node root)
	{
		if(root==null)
			return 0;
		int minLeft=MinValue(root.left);
		int minRight=MinValue(root.right);
		return Math.min(Math.min(minLeft, minRight), root.data);
	}

}
