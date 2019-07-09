// Q : https://practice.geeksforgeeks.org/problems/next-larger-element/0

import java.lang.*;
import java.io.*;
import java.util.*;

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
    	            a[i]=Long.parseLong(nums[i]);
    	        }
    	        
    	        
    	        
    	        Stack<Long> stk = new Stack<Long>();
    	        stk.push(a[n-1]);
    	        String ans ="-1";
    	        for(int i=n-2;i>=0;i--)
    	        {
    	            if(a[i]<stk.peek())
    	            {
    	                //arr[i] = stk.peek();
    	                ans = stk.peek()+" "+ans;
    	            }
    	            else 
    	            {
    	                while(!stk.empty() && a[i]>=stk.peek())
    	                {
    	                    stk.pop();
    	                }
    	                if(stk.empty())
    	                {
    	                    //arr[i] = -1;
    	                    ans = "-1 "+ans;
    	                }
    	                else
    	                {
    	                    //arr[i] = stk.peek();
    	                    ans = stk.peek()+" "+ans;
    	                }
    	            }
    	            stk.push(a[i]);
    	            //ans = arr[i]+" "+ans;
    	        }
    	        System.out.println(ans);
    	    }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}