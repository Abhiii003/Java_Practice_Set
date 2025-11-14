import java.util.*;

public class LeftRightViewBT {
public static Scanner sc=new Scanner(System.in);

	public static class Node{
		Node left,right;
		int data;
		
		Node (int data)
		{
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node root=create();
		System.out.print("Left View: ");
		leftView(root);
		System.out.println();
		System.out.print("Right View: ");
		rightView(root);
	}
	
	public static Node create()
	{
		Node root=null;
		
		System.out.print("Enter data: ");
		int data=sc.nextInt();
		
		if(data==-1)
		return null;
		
		root=new Node(data);
		System.out.println("Enter left data");
		root.left=create();
		System.out.println("Enter right data");
		root.right=create();
		
		return root;
	}
	
	public static void leftView(Node root)
	{
		ArrayList<Integer> list=new ArrayList<>();
		
		leftViewUtil(root,list,0);
		
		for(var curr:list)
		{
			System.out.print(curr+" ");
		}
	}
	
	public static void leftViewUtil(Node root,ArrayList<Integer> list,int level)
	{
		if(root==null)
			return;
		
		 if(list.size()==level){
		        list.add(level,root.data);
		        }
		
		leftViewUtil(root.left,list,level+1);
		leftViewUtil(root.right,list,level+1);
	}
	
	public static void rightView(Node root)
	{
		ArrayList<Integer> list=new ArrayList<>();
		
		rightViewUtil(root,list,0);
		
		for(var curr:list)
		{
			System.out.print(curr+" ");
		}
	}
	
	public static void rightViewUtil(Node root,ArrayList<Integer> list,int level)
	{
		if(root==null)
			return;
		
		 if(list.size()==level){
		        list.add(level,root.data);
		        }
		
		rightViewUtil(root.right,list,level+1);
		rightViewUtil(root.left,list,level+1);
	}

}
