import java.util.*;
public class QueueLL1 {
	static Scanner sc=new Scanner(System.in);
	public static class Node
	{
		int data;
		Node next;
	}
	
	static Node head=null;
	static Node rear=null;
	public static void main(String[] args) {
		while(true)
		{
			System.out.print("Enter choice: ");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: add();break;
			case 2: peek();break;
			case 3: remove();break;
			case 4: size();break;
			case 5: isEmpty();break;
			case 6: display();break;
			}
		}
	}
	
	public static void add()
	{
		Node a=new Node();
		System.out.print("Enter data: ");
		a.data=sc.nextInt();
		if(head==null && rear==null)
		{
			head=rear=a;
		}
		else
		{
		rear.next=a;
		rear=a;
		}
	}
	
	public static void peek()
	{
		System.out.println("Topmost element is: "+head.data);
	}

	public static void remove()
	{
		head=head.next;
	}
	
	public static void size()
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		System.out.println("Size of the queue is: "+count);
	}
	
	public static void isEmpty()
	{
		System.out.println((head==null)?"Queue is empty":"Queue is not empty");
	}
	
	public static void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
