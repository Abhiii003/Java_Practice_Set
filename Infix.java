import java.util.*;
public class Infix {

	public static void main(String[] args) {
		Stack<Integer> val=new Stack<>();
		Stack<Character> op=new Stack<>();
		
		String str="9-5+3*4/6";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int ascii=(int)ch;
			
			if(ascii>=48 && ascii<=57)
				val.push(ascii-48);
			else if(op.size()==0)
				op.push(ch);
			else
			{
				if(ch=='+' ||ch=='-')
				{
					int v2=val.pop();
					int v1=val.pop();
					
					if(op.peek()=='+')
						val.push(v1+v2);
					if(op.peek()=='-')
						val.push(v1-v2);
					if(op.peek()=='*')
						val.push(v1*v2);
					if(op.peek()=='/')
						val.push(v1/v2);
					op.pop();
					op.push(ch);
				}
				
				if(ch=='*'||ch=='/')
				{
					if(op.peek()=='*'||op.peek()=='/')
					{
						int v2=val.pop();
						int v1=val.pop();
						
						if(op.peek()=='+')
							val.push(v1+v2);
						if(op.peek()=='-')
							val.push(v1-v2);
						if(op.peek()=='*')
							val.push(v1*v2);
						if(op.peek()=='/')
							val.push(v1/v2);
						
						op.pop();
						op.push(ch);
					}
					else
						op.push(ch);
				}
			}
		}
		
		while(val.size()>1)
		{
			int v2=val.pop();
			int v1=val.pop();
			
			if(op.peek()=='+')
				val.push(v1+v2);
			if(op.peek()=='-')
				val.push(v1-v2);
			if(op.peek()=='*')
				val.push(v1*v2);
			if(op.peek()=='/')
				val.push(v1/v2);
			op.pop();
		}
		System.out.println("Answer is: "+val.peek());
	}

}
