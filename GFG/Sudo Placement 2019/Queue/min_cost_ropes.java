// Q : https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes/0/?track=sp-queue

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
    	    //Scanner s = new Scanner(System.in);
    	    int T = Integer.parseInt(br.readLine());
    	    while(T-- > 0)
    	    {
    	        PriorityQueue<Long> q = new PriorityQueue<Long>();
    	        long sum = 0;
    	        int n = Integer.parseInt(br.readLine());
    	        String[] str = br.readLine().split(" ");
    	        for(int i=0; i<n; i++)
    	        {
    	            q.add(Long.parseLong(str[i]));
    	        }
    	        
    	        while(q.size()!=1)
    	        {
    	               
    	            long temp = q.poll() + q.poll();
    	            q.add(temp);
    	            sum = sum + temp;
    	            
    	        }
    	        System.out.println(sum);
    	    }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}