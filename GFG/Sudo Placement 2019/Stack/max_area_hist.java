// Q : https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram/0/?track=sp-stack&batchId=152

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
	            int n = Integer.parseInt(br.readLine());
	            long[] a = new long[n];
	            String[] nums = br.readLine().split(" ");
	            for(int i=0; i<n; i++)
	            {
	                a[i] = Long.parseLong(nums[i]);
	            }
	            Stack<Integer> stk = new Stack<Integer>();
	            long max = Long.MIN_VALUE;
	            int i = 0;
	            while(i<n)
	            {
	                if(stk.empty() || a[stk.peek()]<=a[i])
	                {
	                    stk.push(i++);
	                }
	                else
	                {
                        int index = stk.peek();
                        stk.pop();
                        long curr_area = a[index]*(stk.empty()?i:(i-stk.peek()-1));
                        max = Math.max(max,curr_area);
	                }
	            }
	            while(!stk.empty())
	            {
	                int index = stk.peek();
	                stk.pop();
	                long curr_area = a[index]*(stk.empty()?i:(i-stk.peek()-1));
	                max = Math.max(max,curr_area);
	            }
	            System.out.println(max);
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}