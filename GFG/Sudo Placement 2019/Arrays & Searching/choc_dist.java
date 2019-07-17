// Q : https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0/?track=sp-arrays-and-searching&batchId=152

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
	            String[] nums = br.readLine().split(" ");
	            int m = Integer.parseInt(br.readLine());
	            int[] a = new int[n];
	            
	            for(int i=0; i<n ;i++)
	            {
	                a[i] = Integer.parseInt(nums[i]);
	            }
	            
	            Arrays.sort(a);
	            
	            int start = 0;
	            int end = start+m-1;
	            int diff = Integer.MAX_VALUE;
	            while(end<n)
	            {
	                if(a[end]-a[start]<diff)
	                {
	                    diff = a[end]-a[start];
	                }
	                start++;
	                end++;
	            }
	            System.out.println(diff);
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}