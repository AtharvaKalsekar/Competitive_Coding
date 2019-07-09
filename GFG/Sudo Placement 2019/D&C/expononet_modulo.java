// Q : https://practice.geeksforgeeks.org/problems/modular-exponentiation-for-large-numbers/0/?track=dp-divide-and-conquer

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
	        int a = s.nextInt();
	        int b = s.nextInt();
	        int c = s.nextInt();
	        
	        int res = 1;
	        a = a%c;
	        while(b>0)
	        {
	            if(b%2==1)
	            {
	                res = (res*a)%c;
	            }
	            a=(a*a)%c;
	            b = b/2;
	        }
	        System.out.println(res);
	    }
	}
	
}