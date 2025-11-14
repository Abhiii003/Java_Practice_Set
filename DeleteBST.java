import java.util.*;

public class DeleteBST {
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
	
	public static Node delete(Node root,int x)
	{
		if(root==null)
			return null;
		
		if(x<root.data)
			root.left=delete(root.left,x);
		else if(x<root.data)
			root.right=delete(root.right,x);
		else
		{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			root.data=minValue(root.right);
			root.right=delete(root.right,x);
		}
		return root;
	}
	
	public static int minValue(Node root)
	{
		int min=root.data;
		while(root.left!=null)
		{
			min=root.left.data;
			root=root.left;
		}
		return min;
	}

}
