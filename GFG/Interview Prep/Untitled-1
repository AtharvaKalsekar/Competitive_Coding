// Q : https://practice.geeksforgeeks.org/problems/number-of-occurrence/0/?track=searching-interview&batchId=117

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
	            String[] ins = br.readLine().split(" ");
	            int n = Integer.parseInt(ins[0]);
	            int k = Integer.parseInt(ins[1]);
	            int count = 0;
	            String[] nos = br.readLine().split(" ");
	            int[] nums = new int[n];
	            for(int i=0 ; i<n; i++)
	            {
	                nums[i] = Integer.parseInt(nos[i]);
	                if(nums[i]==k)
	                {
	                    count++;
	                }
	                if(nums[i]>k)
	                {
	               
	                    break;
	                }
	            }
	            if(count==0)
	            {
	                System.out.println("-1");
	            }
	            else
	            {
	                System.out.println(count);
	            }
	            
	        }
	        
	    }
	    catch(IOException e)
	    {
	        
	    }
	 }
}