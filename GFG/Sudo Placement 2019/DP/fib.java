// Q : https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers/0/?track=sp-dynamic-programming&batchId=152

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    static long[] dp;
    static long fib(int n)
    {
        if(n<=0)
        {
            return 1;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        dp[n] = fib(n-1)+fib(n-2);
        return dp[n];
    }
	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    while(T-- > 0)
	    {
	        int n = s.nextInt();
	        dp = new long[100];
	        dp[0]=1;
	        dp[1]=1;
	        fib(n);
	        StringBuffer sb = new StringBuffer();
	        for(int i=0; i<n; i++)
	        {
	            sb.append(dp[i]);
	            sb.append(" ");
	        }
	        System.out.println(sb);
	    }
	}
}