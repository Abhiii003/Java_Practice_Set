import java.util.*;
public class Queue1 {
	static Scanner sc=new Scanner(System.in);
	static int arr[];
	static int front=0;
	static int rear=0;
	static int n;
	
	public static void main(String[] args) {
		while(true)
		{
			System.out.print("Enter choice: ");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: create();break;
			case 2: add();break;
			case 3:peek();break;
			case 4:display();break;
			case 5:remove();break;
			}
		}
	}
	
	public static void create()
	{
		System.out.print("Enter size: ");
		n=sc.nextInt();
		arr=new int[n];
	}
	
	public static void add()
	{
		System.out.print("Enter data: ");
		int x=sc.nextInt();
		if(front==0 && rear==0)
		{
			arr[front]=arr[rear]=x;
		}
		arr[rear]=x;
		rear++;
	}
	
	public static void peek()
	{
		System.out.println("First element is: "+arr[front]);
	}
	
	public static void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void remove()
	{
		if(front==0 && rear==0)
		{
			System.out.println("Sorry remove cannot be performed.");
		}
		
		int x=arr[front];
		System.out.println("Removed element is: "+x);
		front++;
	}
}
