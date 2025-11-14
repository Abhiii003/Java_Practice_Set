
public class RatMazeDeadPath_FourDirection {

	public static void main(String[] args) {
		int row=3;
		int column=4;
		int maze[][]= {{1,0,1,1},
				       {1,1,1,1},
				       {1,1,0,1}};
		
		printPaths(0,0,row-1,column-1,"",maze);
		
	
	
	}
	
	public static void printPaths(int sr,int sc,int er,int ec,String path,int maze[][])
	{
		if(sr<0 || sc<0)
			return;
		if(sr>er ||sc>ec)
			return;
		if(sc==ec && sr==er)
		{
			System.out.println(path);
			return;
		}
		if(maze[sr][sc]==0)return;
		if(maze[sr][sc]==-1)return;
		
		maze[sr][sc]=-1;
		
		//for rightwards
				printPaths(sr,sc+1,er,ec,path+"R",maze);
				
				//for downwards
				printPaths(sr+1,sc,er,ec,path+"D",maze);
				
				//for leftwards
				printPaths(sr,sc-1,er,ec,path+"L",maze);
				
				//for upwards
				printPaths(sr-1,sc,er,ec,path+"U",maze);
				
				maze[sr][sc]=1;
			
	}

}
