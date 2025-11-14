import java.util.*;
public class DiameterBT {
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
		System.out.println("Diamter is: "+diameter(root));
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
	
	public static int diameter(Node root)
	{
		if(root==null)
			return 0;
		
		int dl=diameter(root.left);
		int rl=diameter(root.right);
		int curr=height(root.left)+height(root.right)+1;
		
		return Math.max(Math.max(rl,dl), curr);
	}

}
