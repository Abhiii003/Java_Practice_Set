import java.util.*;
public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,5,1};
		int n=18;
		int dp[]=new int[n+1];
		Arrays.fill(dp,-1);
		dp[0]=0;
		
		int ans=coins(n,a,dp);
		System.out.println("Answer is: "+ans);

	}
	
	public static int coins(int n,int a[],int dp[])
	{
		if(n==0)
			return 0;
		
		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(n-a[i]>=0)
			{
				int subAns=0;
				if(dp[n-a[i]]!=-1)
					subAns=dp[n-a[i]];
				else 
					subAns=coins(n-a[i],a,dp);
				
				if(subAns +1<ans && subAns!=Integer.MAX_VALUE)
					ans=subAns+1;
					
			}
		}
		return dp[n]=ans;
	}

}
