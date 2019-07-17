// Q : https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string/0/?track=sp-strings&batchId=152

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
	        String str = br.readLine();
	        int n = str.length();
	        int max = 1;
	        //int o_max = 1;
	        int start,end,count=0;
	        int fStart=0;
	        int fEnd=1;
	        for(int i=1;i<n;i++)
	        {
	            start = i-1;
	            end = i;
	            while(start>=0 && end<=n-1 && str.charAt(start)==str.charAt(end))
	            {
	               // System.out.println("E : "+str.charAt(i));
	                count+=2;
	                start--;
	                end++;
	            }
	            if(count>max)
	            {
	                fStart = start+1;
	                fEnd = end;
	                max=count;
	            }
	            
	            count=1;
	            
	            start = i-1;
	            end = i+1;
	            while(start>=0 && end<=n-1 && str.charAt(start)==str.charAt(end))
	            {
                    //System.out.println("O : "+str.charAt(i));
	                count+=2;
	                start--;
	                end++;
	            }
	            if(count>max)
	            {
	                fStart = start+1;
	                fEnd = end;
	                max = count;
	            }
	            count=0;
	        }
	        if(fEnd>n)
	        {
	            fEnd--;
	        }
	        if(fStart<0)
	        {
	            fStart=0;
	        }
	        
	        System.out.println(str.substring(fStart,fEnd));
	        
	    }
	}
}