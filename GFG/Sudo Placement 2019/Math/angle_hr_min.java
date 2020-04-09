// Q : https://practice.geeksforgeeks.org/problems/angle-between-hour-and-minute-hand/0/?track=sp-mathematics&batchId=152

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
	        double h = Double.parseDouble(nums[0])%12;
	        double m = Double.parseDouble(nums[1])%60;
	        double h_pos = h*30 + m*0.5;
	        double m_pos = m*6;
	        double a1 = Math.abs(h_pos-m_pos);
	        double a2 = Math.abs(360-a1);
	        System.out.println((int)Math.floor(Math.min(a1,a2)));
	    }
	}
}