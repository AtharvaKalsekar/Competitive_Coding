// Q : https://practice.geeksforgeeks.org/problems/is-binary-number-multiple-of-3/0/?track=sp-bit-magic&batchId=152

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    s.nextLine();
	    while(T-- > 0)
	    {
	        String num = s.nextLine();
	        char[] bits = num.toCharArray();
	        int oc=0;
	        int ec=0;
	        int l = num.length();
	        for(int i=0;i<l;i++)
	        {
	            if(bits[i]=='1')
	            {
	                if((i&1)==1)
	                {
	                    oc++;
	                }
	                else
	                {
	                    ec++;
	                }
	            }
	        }
	        if(Math.abs(oc-ec)%3==0)
	        {
	            System.out.println("1");
	        }
	        else
	        {
	            System.out.println("0");
	        }
	    }
	}
}