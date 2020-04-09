// Q : https://practice.geeksforgeeks.org/problems/count-ways-to-nth-stairorder-does-not-matter/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args) throws IOException
	{
	    InputStreamReader in = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(in);
	    int T = Integer.parseInt(br.readLine());
	    while(T-- > 0)
	    {
	        int n = Integer.parseInt(br.readLine());
	        int[] dp = new int[n+1];
	        dp[0]=1;
	        for(int i=1;i<=n;i++)
	        {
	            dp[i]=dp[i]+dp[i-1];
	        }
	        for(int i=2;i<=n;i++)
	        {
	            dp[i]=dp[i]+dp[i-2];
	        }
	        
	        System.out.println(dp[n]);
	    }
	}
}