import java.util.*;
public class BinaryTree2 {
	static Scanner sc=new Scanner(System.in);
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
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
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
	
	public static void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+"->");
		inOrder(root.right);
	}
	
	public static void preOrder(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(Node root)
	{
		if(root==null)
		  return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}

}
