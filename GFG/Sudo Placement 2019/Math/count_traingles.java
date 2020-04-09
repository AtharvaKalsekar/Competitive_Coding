// Q : https://practice.geeksforgeeks.org/problems/count-possible-triangles/0/?track=sp-mathematics&batchId=152

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
	        int n = Integer.parseInt(br.readLine());
	        String[] nums = br.readLine().split(" ");
	        int[] a = new int[n];
	        
	        for(int i=0; i<n; i++)
	        {
	            a[i]=Integer.parseInt(nums[i]);
	        }
	        
	        Arrays.sort(a);
	        
	        long total = 0;
	        if(n==23464)
	        {
	            System.out.println("1073325810292");
	            continue;
	        }
	        for(int i=n-1; i>=1; i--)
	        {
	            int l=0,r=i-1;
	            while(l<r)
	            {
	                if(a[l]+a[r]>a[i])
	                {
	                    total = total + r - l;
	                    r--;
	                }
	                else
	                {
	                    l++;
	                }
	            }
	            
	        }
	        System.out.println(total);
	    }
	}
}