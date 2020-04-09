// Q : https://practice.geeksforgeeks.org/problems/next-in-series/0/?track=sp-mathematics&batchId=152

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args)
	{
	    Scanner s  = new Scanner(System.in);
	    int T = s.nextInt();
	    while(T-- > 0)
	    {
	        int n = s.nextInt();
	        long[] a = new long[n];
	        for(int i=0; i<n; i++)
	        {
	            a[i] = s.nextLong();
	        }
	        
	        boolean flagAP = true;
	        long d = a[1] - a[0];
	        for(int i=1; i<n-1; i++)
	        {
	            long temp = a[i+1]-a[i];
	            if(temp!=d)
	            {
	                flagAP = false;
	                break;
	            }
	        }
	        if(flagAP)
	        {
	            System.out.println(a[n-1]+d);
	            continue;
	        }
	        
	        
	        boolean flagGP = true;
	        double r =(double)a[1] / a[0];
	        for(int i=1; i<n-1; i++)
	        {
	            if(a[i]==0)
	            {
	                flagGP = false;
	                break;
	            }
	            double temp = (double)a[i+1]/a[i];
	            
	            //System.out.println(r+","+temp+","+(a[i+1]/a[i]));
	            if(temp!=r)
	            {
	                flagGP = false;
	                break;
	            }
	        }
	        if(flagGP)
	        {
	            System.out.println((int)(a[n-1]*r));
	            continue;
	        }
	        
	        
	        boolean flagFib = true;
	   
	        for(int i=2; i<n-1; i++)
	        {
	            long temp = a[i-1]+a[i-2];
	            if(temp!=a[i])
	            {
	                flagFib = false;
	                break;
	            }
	        }
	        if(flagFib)
	        {
	            System.out.println(a[n-1]+a[n-2]);
	            continue;
	        }
	        
	        if(!flagAP && !flagGP && !flagFib)
	        {
	            System.out.println(-99999);
	            
	        }
	    }
	}
}