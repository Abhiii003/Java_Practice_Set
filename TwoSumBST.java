import java.util.*;


public class TwoSumBST {
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
	
	public boolean isPairPresent(Node root)
	{
		Set<Integer> set=new HashSet<>();
		return util(root,22,set);
	}
	
	public boolean util(Node root,int sum,Set<Integer> set)
	{
		if(root==null)
			return false;
		
		if(util(root.left,sum,set)==true)
			return true;
		
		if(set.contains(sum-root.data))
			return true;
		
		set.add(root.data);
		return util(root.right,sum,set);
	}
	

	
	

}
