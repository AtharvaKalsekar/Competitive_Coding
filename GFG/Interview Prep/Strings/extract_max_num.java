// Q : https://practice.geeksforgeeks.org/problems/extract-maximum/0/?track=string-interview

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
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
	            String str = br.readLine();
	            Pattern pat = Pattern.compile("[0-9]+");
	            Matcher matcher = pat.matcher(str);
	            long max = -1;
	            while(matcher.find())
	            {
	                long curr = Long.parseLong(matcher.group());
	                if(curr>max)
	                {
	                    max = curr;
	                }
	            }
	            System.out.println(max);
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	 }
}