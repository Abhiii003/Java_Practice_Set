
public class RatMaze_FourDirection {

	public static void main(String[] args) {
		int row=3;
		int column=3;
		boolean isVisited[][]=new boolean[row][column];
		printPaths(0,0,row-1,column-1,"",isVisited);

	}
	
	public static void printPaths(int sr,int sc,int er,int ec,String path,boolean visited[][]) {
		if(sr<0 ||sc<0)
			return;
		if(sr>er ||sc>ec)
			return;
		if(visited[sr][sc]==true)
			return;
		if(sr==er &&sc==ec)
		{
			System.out.println(path);
			return;
		}
		
		visited[sr][sc]=true;
		
		//for rightwards
		printPaths(sr+1,sc,er,ec,path+"R",visited);
		
		//for downwards
		printPaths(sr,sc+1,er,ec,path+"D",visited);
		
		//for leftwards
		printPaths(sr-1,sc,er,ec,path+"L",visited);
		
		//for upwards
		printPaths(sr,sc-1,er,ec,path+"R",visited);
		
		visited[sr][sc]=false;
	}
}
