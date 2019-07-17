// Q : https://practice.geeksforgeeks.org/problems/check-if-a-integer-is-power-of-8-or-not/0/?track=sp-bit-magic&batchId=152

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
	        long num = s.nextLong();
	        double n = Math.log(num)/Math.log(8);
	        /*
	        while(num%8==0)
	        {
	            num=num/8;
	        }
	        */
	        if(n-Math.floor(n)<0.00001)
	        {
	            System.out.println("Yes");
	        }
	        else
	        {
	            System.out.println("No");
	        }
	        
	    }
	}
}