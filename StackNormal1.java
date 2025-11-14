import java.util.*;
public class StackNormal1 {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(2);
		st.push(5);
		st.push(6);
		st.push(9);
		st.push(69);
		System.out.println(st);
		
		Stack<Integer> rt=new Stack<>();
		while(st.size()>0)
		{
			rt.push(st.pop());
		}
		
		System.out.println(rt);
	}

}
