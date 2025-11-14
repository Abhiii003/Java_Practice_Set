import java.util.*;
public class LevelOrderBT {
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
		levelOrder(root);
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
	
	public static void levelOrder(Node root)
	{
		if(root==null)
			return;
		
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node curr=q.remove();
			System.out.print(curr.data+" ");
			
			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
		}
	}
}
