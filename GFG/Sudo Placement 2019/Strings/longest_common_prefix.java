// Q : https://practice.geeksforgeeks.org/problems/minimum-shift-for-longest-common-prefix/0/?track=sp-strings&batchId=152

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
	        String s1 = br.readLine();
	        String s2 = br.readLine();
	        int l1 = s1.length();
	        int l2 = s2.length();
	        int start = -1;
	        String ans = "";
	        for(int i=1; i<l1; i++)
	        {
	            String ss = s1.substring(0,i);
	            int pos = s2.indexOf(ss);
	            if(pos<0)
	            {
	                break;
	            }
	            start = pos;
	            ans = ss;
	        }
	        System.out.println(start+" "+ans);
	    }
	}
}