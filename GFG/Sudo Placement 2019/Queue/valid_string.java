// Q : https://practice.geeksforgeeks.org/problems/valid-substring/0/?track=sp-queue&batchId=152

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
	            String exp = br.readLine();
	            Stack<Integer> stk = new Stack<Integer>();
	            int l = exp.length();
	            int count = 0;
	            int max = 0;
	            stk.push(-1);
	            for(int i=0;i<l;i++)
	            {
	                char c = exp.charAt(i);
	                if(c=='(')
	                {
	                    stk.push(i);
	                }
	                else 
	                {
	                    stk.pop();
	                    if(!stk.empty())
	                    {
	                        max = Math.max(max,i-stk.peek());
	                    }
	                    else
	                    {
	                        stk.push(i);
	                    }
	                }
	                
	            }
	            
	            System.out.println(max);
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}