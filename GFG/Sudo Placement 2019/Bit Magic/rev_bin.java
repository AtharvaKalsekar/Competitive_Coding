// Q : https://practice.geeksforgeeks.org/problems/reverse-bits/0/?track=sp-bit-magic&batchId=152

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
	        int num = s.nextInt();
	        char[] bits = new char[32];
	        Arrays.fill(bits,'0');
	        
	        int i=0;
	        while(num>0)
	        {
	            if((num&1) == 1)
	            {
	                bits[i]='1';
	            }
	            i++;
	            num = num>>1;
	        }
	        
	        
	        /*
	        for(char c:bits)
	        {
	            System.out.print(c);
	        }
	        System.out.println();
	        */
	        String rev_bin = new String(bits);
	        //System.out.println(rev_bin);
	        System.out.println(Long.parseLong(rev_bin,2));
	    }
	}
}