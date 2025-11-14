import java.util.*;
public class DoublyLL1 {
	static Scanner sc=new Scanner(System.in);
	static Node head=null;
	static Node tail=null;
	public static class Node
	{
		int data;
		Node next;
		Node prev;
		
//		Node(int d)
//		{
//			this.data=d;
//		}
	}
	public static void main(String[] args) {
		while(true)
		{
			System.out.print("Enter choice: ");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:create();break;
			case 2:display();break;
			case 3:displayRev(); break;
			case 4:insertBeg();break;
			case 5:insertEnd();break;
			case 6:insertRand();break;
			case 7:deleteBeg();break;
			case 8:deleteEnd();break;
			case 9: deleteRand();break;
			}
		}
	}
	
	public static void create()
	{
		Node a =new Node();
		System.out.print("Enter the node: ");
		a.data=sc.nextInt();
		a.prev=null;
		a.next=null;
		head=a;
		
		System.out.print("Enter the number of nodes: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			Node b=new Node();
			System.out.print("Enter the data: ");
			b.data=sc.nextInt();
			b.next=null;
			tail=b;
			a.next=b;
			b.prev=a;
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
	
	public static void displayRev()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.prev;
		}
		System.out.println();
	}
	
	public static void insertBeg()
	{
		System.out.print("Enter data: ");
		Node newNode=new Node();
		newNode.data=sc.nextInt();
		newNode.next=head;
		newNode.prev=null;
		head.prev=newNode;
		head=newNode;
	}
	
	public static void insertEnd()
	{
		Node temp=tail;
		System.out.print("Enter data: ");
		Node newNode=new Node();
		newNode.data=sc.nextInt();
		newNode.next=null;
		newNode.prev=tail;
		tail.next=newNode;
		tail=newNode;
	}
	
	public static void insertRand()
	{
		Node newNode=new Node();
		System.out.print("Enter position: ");
		int n=sc.nextInt();
		System.out.print("Enter data: ");
		newNode.data=sc.nextInt();
		Node temp=head;
		
		for(int i=1;i<n-1;i++)
		{
			temp=temp.next;
		}
		temp.next.prev=newNode;
		newNode.next=temp.next;
		temp.next=newNode;
		newNode.prev=temp;
	}
	
	public static void deleteBeg()
	{
		head=head.next;
		head.prev=null;
	}
	
	public static void deleteEnd()
	{
		tail=tail.prev;
		tail.next=null;
	}
	
	public static void deleteRand()
	{
		Node temp=head;
		System.out.print("Enter position to delete: ");
		int n=sc.nextInt();
		
		for(int i=1;i<n-1;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		temp.next.prev=temp;
	}

}
