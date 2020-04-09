// Q : https://practice.geeksforgeeks.org/problems/squares-in-a-matrix/0/?track=sp-mathematics&batchId=152

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
	        long m = s.nextLong();
	        long n = s.nextLong();
	        
	        if(m>n)
	        {
	            long temp = m;
	            m = n;
	            n = temp;
	        }
	        //System.out.println(m+" "+n);
	        long r1 = (m*(m+1)*(2*m+1)/6) + (m*(m+1)*(n-m)/2);
	        System.out.println(r1);
	    }
	}
}