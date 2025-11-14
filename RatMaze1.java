import java.util.*;
public class RatMaze1 {

	public static void main(String[] args) {
		int count=maze(1,1,2,2);
		System.out.println("No of ways are: "+count);
	}
	
	public static int maze(int sr,int sc,int er,int ec)
	{
		if(sr>er || sc>ec)
			return 0;
		if(sr==er && sc==ec)
			return 1;
		
		int downWays=maze(sr+1,sc,er,ec);
		int rightWays=maze(sr,sc+1,er,ec);
		int totalWays=downWays+rightWays;
		return totalWays;
	}

}
