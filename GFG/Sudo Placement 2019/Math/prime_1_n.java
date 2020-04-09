// Q : https://practice.geeksforgeeks.org/problems/sum-of-all-prime-numbers-between-1-and-n/0/?track=sp-mathematics

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    while(T-- > 0)
	    {
	        int n = s.nextInt();
	        boolean[] a = new boolean[n+1];
	        Arrays.fill(a,true);
	        
	        
	        for(int p=2; p*p<=n; p++)
	        {
	            if(a[p])
	            {
	                for(int i=p*p ; i<=n; i+=p)
	                {
	                    a[i]=false;
	                }
	            }
	        }
	        
	        long sum = 0;
	        for(int i=2; i<=n; i++)
	        {
	            if(a[i])
	            {
	                sum = sum + i;
	            }
	        }
	        System.out.println(sum);
	    }
	}
}