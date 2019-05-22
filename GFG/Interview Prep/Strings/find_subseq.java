// Q : https://practice.geeksforgeeks.org/problems/check-for-subsequence/0/?track=string-interview&batchId=117

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    try
	    {
	        InputStreamReader in = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(in);
	        int T = Integer.parseInt(br.readLine());
	        while(T-- > 0)
	        {
	            String[] st = br.readLine().split(" ");
	            int l2 = st[1].length();
	            int l1 = st[0].length();
	            int j=0;
	            for(int i=0; i<l2; i++)
	            {
	                char curr = st[0].charAt(j);
	                if(st[1].charAt(i)==curr)
	                {
	                    j++;
	                    if(j>=l1)
	                    {
	                        break;
	                    }
	                }
	            }
	            if(j==l1)
	            {
	                System.out.println("1");
	            }
	            else
	            {
	                System.out.println("0");
	            }
	        }
	        
	    }
	    catch(IOException e)
	    {
	        
	    }
	 }
}