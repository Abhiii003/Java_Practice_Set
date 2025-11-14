import java.util.*;


public class LowestCommonAncestorBT {
	static Scanner sc=new Scanner(System.in);
	static public class Node{
		Node left,right;
		int data;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node root=create();
		System.out.println("LCA is: "+lca(root,7,6));
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
	
	public static Node lca(Node root,int n1,int n2)
	{
		if(root==null) return null;
		if(root.data==n1 || root.data==n2) return root;
		
		Node left=lca(root.left,n1,n2);
		Node right=lca(root.right,n1,n2);
		
		if(left==null) return right;
		if(right==null) return left;
		
		return root;
	}
	{
		
	}

}
