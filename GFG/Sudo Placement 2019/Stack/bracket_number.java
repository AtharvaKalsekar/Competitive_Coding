// Q : https://practice.geeksforgeeks.org/problems/print-bracket-number/0/?track=sp-stack

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
	            String exp =  br.readLine();
	            int count = 0;
	            int max = 0;
	            int le = exp.length();
	            StringBuffer sb = new StringBuffer();
	            Stack<Integer> stk = new Stack<Integer>();
	            for(int i=0 ; i<le; i++)
	            {
	                if(exp.charAt(i)=='(')
	                {
	                    count = max;
	                    stk.push(++count);
	                    sb.append(stk.peek()+" ");
	                    if(count>max)
	                    {
	                        max = count;
	                    }
	                }
	                else if(exp.charAt(i)==')')
	                {
	                    sb.append((stk.pop())+" ");
	                    count--;
	                }
	            }
	            System.out.println(sb);
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}