// https://practice.geeksforgeeks.org/problems/next-larger-element/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args) throws IOException
	{
	    //Scanner s = new Scanner(System.in);
	    InputStreamReader inp = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(inp);
	    //int T = s.nextInt();
	    int T = Integer.parseInt(br.readLine());
	    while(T-->0)
	    {
	        //int n = s.nextInt();
	        int n = Integer.parseInt(br.readLine());
	        String[] arr = br.readLine().split(" ");
	        long[] a = new long[n];
	        for(int i=0; i<n; i++)
	        {
	            //a[i] = s.nextLong();
	            a[i] = Long.parseLong(arr[i]);
	        }
	        Stack<Integer> stk = new Stack<Integer>();
	        stk.push(0);
	        long[] ans = new long[n];
	        ans[n-1] = -1;
	        for(int i=1; i<n; i++)
	        {
	            if(a[stk.peek()]>=a[i])
	            {
	                stk.push(i);
	            }
	            else
	            {
	                while(!stk.empty() && a[stk.peek()]<a[i])
	                {
	                    ans[stk.pop()] = a[i];
	                }
	                stk.push(i);
	            }
	        }
	        while(!stk.empty())
	        {
	            ans[stk.pop()] = -1;
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        
	        for(long x : ans)
	        {
	            //System.out.print(x+" ");
	            sb.append(x+" ");
	        }
	        System.out.println(sb);
	    }
	}
}