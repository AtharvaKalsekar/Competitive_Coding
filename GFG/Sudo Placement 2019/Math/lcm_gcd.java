// Q : https://practice.geeksforgeeks.org/problems/lcm-and-gcd/0/?track=sp-mathematics&batchId=152

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    static long gcd(long a, long b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
	public static void main (String[] args) throws IOException
	{
	    //Scanner s = new Scanner(System.in);
	    InputStreamReader in = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(in);
	    int T = Integer.parseInt(br.readLine());
	    while(T-- > 0)
	    {
	        String[] nums = br.readLine().split(" ");
	        long a = Long.parseLong(nums[0]);
	        long b = Long.parseLong(nums[1]);
	        long g = gcd(a,b);
	        long l = a*b/g;
	        System.out.println(l+" "+g);
	    }
	}
}