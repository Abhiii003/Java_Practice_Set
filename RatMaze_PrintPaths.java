
public class RatMaze_PrintPaths {

	public static void main(String[] args) {
		printPaths(1,1,3,3,"");
	}
	
	public static void printPaths(int sr,int sc,int er,int ec,String path)
	{
		if(sr>er || sc>er)
			return;
		if(sr==er && sc==ec)
		{
			System.out.println(path);
			return;
		}
		
		printPaths(sr+1,sc,er,ec,path+"D");
		printPaths(sr,sc+1,er,ec,path+"R");
	}

}
