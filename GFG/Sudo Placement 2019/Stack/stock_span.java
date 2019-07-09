// Q : https://practice.geeksforgeeks.org/problems/stock-span-problem/0/?track=sp-stack&batchId=152

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
	            String[] str = br.readLine().split(" ");
	            int[]  a = new int[n];
	            StringBuffer sb = new StringBuffer();
	            for(int i=0; i<n; i++)
	            {
	                a[i] = Integer.parseInt(str[i]);
	                int j=i;
	                int count = 0;
	                while(j>=0)
	                {
	                    if(a[j]<=a[i])
	                    {
	                        count++;
	                        j--;
	                    }
	                    else
	                    {
	                        break;
	                    }
	                }
	                sb.append(count+" ");
	            }
	            System.out.println(sb);
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}

/*
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
	            String[] str = br.readLine().split(" ");
	            int[] a = new int[n];
	            //int[] s = new int[n];
	            //s[0]=1;
	            StringBuffer sb = new StringBuffer();
	            sb.append("1 ");
	            Stack<Integer> stk = new Stack<Integer>();
	            stk.push(0);
	            for(int i=0; i<n; i++)
	            {
	                a[i] = Integer.parseInt(str[i]);
	            }
	            for(int i=1; i<n; i++)
	            {
	                while(!stk.empty() && a[stk.peek()]<=a[i])
	                {
	                    stk.pop();
	                }
	                int elem = stk.empty()?(i+1):(i-stk.peek());
	                sb.append(elem+" ");
	                stk.push(i);
	            }
	            System.out.println(sb);
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}
*/ 