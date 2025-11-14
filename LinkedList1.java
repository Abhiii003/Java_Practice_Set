import java.util.Scanner;

public class LinkedList1 {
	static Scanner sc=new Scanner(System.in);
	static Node head=null;
	public static class Node{
		int data;
		Node next;
		
	}
	public static void main(String[] args) {
		while(true)
		{
			System.out.print("Enter choice: ");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: create(); break;
			case 2: display(); break;
			case 3: insertBeg();break;
			case 4: insertEnd();break;
			case 5:insertRand();break;
			case 6:deleteFirst();break;
			case 7:deleteEnd();break;
			case 8:deleteRand();break;
			case 9:getElement();break;
			}
		}
	}
	
	public static void create()
	{
		Node a =new Node();
		System.out.print("Enter the first node data: ");
		a.data=sc.nextInt();
		a.next=null;
		head=a;
		
		System.out.print("Enter the number of nodes to link: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			Node b=new Node();
			System.out.print("Enter node data: ");
			b.data=sc.nextInt();
			b.next=null;
			a.next=b;
			a=b;
		}
	}

	public static void display()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static void insertBeg()
	{
		Node newNode=new Node();
		System.out.print("Enter data to insert first: ");
		newNode.data=sc.nextInt();
		newNode.next=head;
		head=newNode;
	}
	
	public static void insertEnd()
	{
		Node newNode=new Node();
		System.out.print("Enter adata to insert at the end: ");
		newNode.data=sc.nextInt();
		Node temp=head;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
	
	public static void insertRand()
	{
		System.out.print("Enter the location to insert: ");
		int n=sc.nextInt();
		System.out.print("Enter data of node to insert at "+n+": ");
		Node newNode=new Node();
		newNode.data=sc.nextInt();
		Node temp=head;
		
		for(int i=1;i<n-1;i++)
		{
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	public static void deleteFirst()
	{
		head=head.next;
	}
	
	public static void deleteEnd()
	{
		Node temp=head;
		
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
	}
	
	public static void deleteRand()
	{
		System.out.print("Enter position to delete: ");
		int n=sc.nextInt();
		Node temp=head;
		
		for(int i=1;i<n-1;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	
	public static void getElement()
	{
		System.out.print("Enter location of access: ");
		int n=sc.nextInt();
		Node temp=head;
		
		for(int i=1;i<n;i++)
		{
			temp=temp.next;
		}
		
		System.out.println("Element at position:  "+n+" is: "+temp.data);
	}
}
