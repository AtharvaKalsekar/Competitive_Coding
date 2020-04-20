// https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k/0
// check my submissions

import java.lang.*;
import java.io.*;
import java.util.*;

class GFG
{
	public static void main (String[] args) throws IOException
	{
	    InputStreamReader in = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(in);
	    int T = Integer.parseInt(br.readLine());
	    while(T-- > 0)
	    {
	        String[] params = br.readLine().split(" ");
	        int n = Integer.parseInt(params[0]);
	        int k = Integer.parseInt(params[1]);
	        
	        String[] nums = br.readLine().split(" ");
	        int[] a = new int[n];
	        for(int i=0; i<n; i++)
	        {
	            a[i] = Integer.parseInt(nums[i]);
	        }
	        StringBuilder sb = new StringBuilder();
	        
	        LinkedList<Integer> ll = new LinkedList<Integer>();
	        
	        int i=0;
	        for(; i<k; i++)
	        {
	            while( ll.size()>0 && a[i] >= a[ll.peekLast()])
	            {
	                ll.removeLast();
	            }
	            ll.addLast(i);
	        }
	        
	        for(; i<n; i++)
	        {
	            sb.append(a[ll.peekFirst()]+" ");
	            
	            while(ll.size()>0 && ll.peekFirst() <= i-k)
	            {
	                ll.removeFirst();
	            }
	            
	            while(ll.size()>0 && a[i] >= a[ll.peekLast()])
	            {
	                ll.removeLast();
	            }
	            
	            ll.addLast(i);
	            
	       
	        }
	        sb.append(a[ll.peekFirst()]+" ");
	       
	        System.out.println(sb);
	    }
	}
}