import java.util.*;
public class Stack1 {
	static Scanner sc=new Scanner(System.in);
	static int arr[];
	static int idx=0;
	static int n;
	public static class Stack
	{
		public static void create()
		{
			System.out.print("Enter size: ");
			n=sc.nextInt();
			arr=new int[n];
		}
		
		public static void push(int x)
		{
			arr[idx]=x;
			idx++;
		}
		public static void peek()
		{
			System.out.println("Topmost element is: "+arr[arr.length-1]);
		}
		
		public static void display()
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		public static void size()
		{
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
					count++;
			}
			System.out.println("Size is: "+count);
		}
		
		public static void isFull()
		{
			if(arr.length==n)
				System.out.println("Stack is full");
			else
			System.out.println("Stack is not full");
		}
		
		public static void isEmpty()
		{
			if(arr.length==0)
				System.out.println("Stack is empty");
			else
				System.out.println("Stack is not empty");
		}
	}
	public static void main(String[] args) {
			Stack s=new Stack();
			while(true)
			{
				System.out.print("Enter choice: ");
				int choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:s.create();break;
				case 2:s.peek();break;
				case 3:{
					System.out.print("Enter data: ");
					int x=sc.nextInt();
					s.push(x);
					break;
				}
				case 4:s.display();break;
				case 5: s.isEmpty();break;
				case 6:s.isFull();break;
				case 7:s.size();break;
				}
			}
			
	}
	
	
	
	

}
