// Q : https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k/0/?track=sp-queue&batchId=152

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
	        int n = s.nextInt();
	        StringBuffer sb = new StringBuffer();
	        int[] a = new int[n];
	        for(int i=0; i<n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        int k = s.nextInt();
	        Queue<Integer> q = new LinkedList<Integer>();
	        int st = 0;
	        int en = 0;
	        while(en<k)
	        {
	            if(a[en]<0)
	            {
	                q.add(a[en]);
	            }
	            en++;
	        }
	        --en;
	        while(en<n)
	        {
	            
	            if(q.isEmpty())
	            {
	                sb.append("0 ");
	            }
	            else
	            {
	                sb.append(q.peek()+" ");
	            }
	            
	            if(!q.isEmpty() && q.peek()==a[st])
	            {
	                q.poll();
	            }
	            ++st;
	            ++en;
	            if(en<n && a[en]<0)
	            {
	                q.add(a[en]);
	            }
	            
	        }
	        System.out.println(sb);
	    }
	}
}