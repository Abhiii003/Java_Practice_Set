import java.util.*;

public class SeachBST {
	public static class Node{
		Node left,right;
		int data;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Node root=create();
		System.out.println("Is the number present? "+search(root,69));
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
	
	public static boolean search(Node root,int x)
	{
		if(root==null)
			return false;
		
		if(root.data==x)
			return true;
		
		if(root.data>x)
			return search(root.left,x);
		return search(root.right,x);
	}

}
