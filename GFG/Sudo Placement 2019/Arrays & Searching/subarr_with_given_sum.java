// Q : https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0/?track=sp-arrays-and-searching&batchId=152

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args) throws IOException
	{
	    InputStreamReader in = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(in);
	    int T = Integer.parseInt(br.readLine());
	    while(T-- > 0)
	    {
	       String[] pars = br.readLine().split(" ");
	       int n = Integer.parseInt(pars[0]);
	       int s = Integer.parseInt(pars[1]);
	       String[] nums = br.readLine().split(" ");
	       
	       int[] a = new int[n];
	       long maxSum=0;
	       long min=Long.MAX_VALUE;
	       for(int i=0; i<n; i++)
	       {
	           a[i] = Integer.parseInt(nums[i]);
	           if(a[i]<min)
	           {
	               min = a[i];
	           }
	           maxSum = maxSum + a[i];
	       }
	       
	       if(s<min || s>maxSum)
	       {
	           System.out.println(-1);
	           continue;
	       }
	       
	       int start = 0;
	       int end = 1;
	       long sum = a[start];
 	       boolean flag = false;
 	       while(end<n)
	       {
	           
	           if(sum+a[end] > s)
	           {
	               sum = sum - a[start];
	               start++;
	           }
	           else if(sum + a[end] <=s)
	           {
	               sum = sum + a[end];
	               end++;
	           }
	           if(sum == s)
	           {
	               System.out.println((start+1)+" "+(end));
	               flag = true;
	               break;
	           }
	       }
	       if(!flag)
	       {
	           System.out.println(-1);
	       }
	    }
	    
	}
}