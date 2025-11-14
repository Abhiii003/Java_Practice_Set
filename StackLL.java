import java.util.*;
public class StackLL {
	static Scanner sc =new Scanner(System.in);
	static class Node
	{
		int data;
		Node next;
	}
	static Node head=null;
	public static void main(String[] args) {
		while(true)
		{
			System.out.print("Enter choice: ");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				System.out.print("Enter data: ");
				int x=sc.nextInt();
				push(x);
				break;
			}
			case 2: peek();break;
			case 3: pop();break;
			case 4: display();break;
			case 5: size();break;
			}
		}
	}
	
	public static void push(int x)
	{
		Node a=new Node();
		a.data=x;
		a.next=head;
		head=a;
	}
	
	public static void peek()
	{
		System.out.println("Top element is: "+head.data);
	}
	
	public static void pop()
	{
		Node temp=head;
		
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
	}
	
	public static void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	
	public static void size()
	{
		Node temp=head;
		int count=0;
		
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		
		System.out.println("Size of the stack is: "+count);
	}
}
