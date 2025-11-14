import java.util.*;
public class DLLConversionBT {
	public static class Node{
		Node left,right;
		int data;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	static Scanner sc=new Scanner(System.in);
	static Node prev=null;
	static Node next=null;
	static Node head=null;
	public static void main(String[] args) {
		Node root=create();
		conversion(root);
	}
	
	public static Node create()
	{
		Node root=null;
		System.out.print("Enter data: ");
		int data=sc.nextInt();
		
		if(data==-1)
			return null;
		
		System.out.println("Enter left data0 of "+data);
		root.left=create();
		System.out.println("Enter right data of "+data);
		return root;
	}
	
	public static void conversion(Node root)
	{
		if(root==null)
			return;
		conversion(root.left);
		
		if(prev==null)
			head=root;
		else
		{
			root.left=prev;
			prev.right=root;
		}
		prev=root;
		conversion(root.right);
	}

}
