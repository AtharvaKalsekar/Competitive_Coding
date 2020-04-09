// Q : https://practice.geeksforgeeks.org/problems/power-of-2/0/?track=sp-mathematics

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
	        long n = Long.parseLong(br.readLine());
	        double ans = Math.log(n)/Math.log(2);
	        if(ans-Math.floor(ans)<0.000001)
	        {
	            System.out.println("YES");
	        }
	        else
	        {
	            System.out.println("NO");
	        }
	    }
	}
}