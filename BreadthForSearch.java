import java.util.*;
public class BreadthForSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
		
		graph.add(new ArrayList<>(Arrays.asList(1,2)));
		graph.add(new ArrayList<>(Arrays.asList(0,3,4)));
		graph.add(new ArrayList<>(Arrays.asList(0)));
		graph.add(new ArrayList<>(Arrays.asList(1)));
		graph.add(new ArrayList<>(Arrays.asList(1)));
		
		bfs(graph,0);

	}
	
	public static void bfs(ArrayList<ArrayList<Integer>> graph,int start)
	{
		Queue<Integer> q=new LinkedList<>();
		boolean vis[]=new boolean[graph.size()];
		q.add(start);
		vis[start]=true;
		
		while(!q.isEmpty())
		{
			int curr=q.remove();
			System.out.print(curr+" ");
			
			for(int neighbour:graph.get(curr))
			{
				if(!vis[neighbour])
				{
					vis[neighbour]=true;
					q.add(neighbour);
				}
			}
		}
	}
	{
		
	}

}
