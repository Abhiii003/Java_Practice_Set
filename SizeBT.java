import java.util.*;
public class SizeBT {
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
		System.out.println("Size of the Binary Tree is: "+size(root));
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
	
	public static int size(Node root)
	{
		if(root==null)
			return 0;
		return (size(root.left)+size(root.right)+1);
	}

}
