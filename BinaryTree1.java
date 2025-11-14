import java.util.*;
public class BinaryTree1 {
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
		System.out.println("Root is: "+create());
	}
	
	public static Node create()
	{
		Node root=null;
		System.out.print("Enter data: ");
		int data=sc.nextInt();
		
		if(data==-1)
			return null;
		
		root =new Node(data);
		
		System.out.print("Enter left node of "+data);
		root.left=create();
		
		System.out.print("Enter right node of "+data);
		root.right=create();
		return root;
	}

}
