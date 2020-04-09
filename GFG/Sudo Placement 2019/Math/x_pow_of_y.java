// Q : https://practice.geeksforgeeks.org/problems/check-if-a-number-is-power-of-another-number/0/?track=sp-mathematics&batchId=152

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
	        String[] nums = br.readLine().split(" ");
	        long x = Long.parseLong(nums[0]);
	        long y = Long.parseLong(nums[1]);
	        double ans = Math.log(y)/Math.log(x);
	        System.out.println(ans);
	        System.out.println(Math.floor(ans));
	        if(ans-Math.floor(ans)<0.000001)
	        {
	            System.out.println("1");
	        }
	        else
	        {
	            System.out.println("0");
	        }
	    }
	}
}