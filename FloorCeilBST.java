import java.util.*;

public class FloorCeilBST {
	public static class Node{
		int data;
		Node left,right;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Node root=create();
		System.out.println("Floor value is: "+floor(root,45));
		System.out.println("ceil value is: "+ceil(root,45));
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
	
	public static int floor(Node root,int key)
	{
		int ans=Integer.MAX_VALUE;
		
		while(root!=null)
		{
			if(root.data==key)
				return root.data;
			
			if(root.data>key)
			{
				root=root.left;
			}
			else
			{
				ans=root.data;
				root=root.right;
			}
		}
		
		return ans;
	}
	
	public static int ceil(Node root,int key)
	{
		int ans=Integer.MIN_VALUE;
		
		while(root!=null)
		{
			if(root.data==key)
				return root.data;
			
			if(root.data<key)
			{
				root=root.right;
			}
			else
			{
				ans=root.data;
				root=root.left;
			}
		}
		return ans;
	}

}
