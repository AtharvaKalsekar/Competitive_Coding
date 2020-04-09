import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    static int[] dp = new int[100000+1];
	public static void main (String[] args) throws IOException
	{
	    
	    InputStreamReader in = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(in);
	    int T = Integer.parseInt(br.readLine());
	    dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        int m = 1000000007;
        for(int i=3;i<=100000;i++)
        {
            dp[i]= (dp[i-2]+dp[i-1])%m;
        }
	    while(T-- > 0)
	    {
	        
	        int n = Integer.parseInt(br.readLine());
	        /*
	        if(n==1)
	        {
	            System.out.println(1);
	            continue;
	        }
	        int m = 1000000007;
	        double p1 = Math.pow((1+Math.sqrt(5))/2,n+1);
	        double ans = Math.round(p1/Math.sqrt(5))%m;
	        System.out.println((int)ans);
	        */
	        
	        System.out.println(dp[n]);
	        
	    }
	}
}