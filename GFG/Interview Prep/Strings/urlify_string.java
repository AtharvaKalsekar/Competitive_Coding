// Q : https://practice.geeksforgeeks.org/problems/urlify-a-given-string/0/?track=string-interview

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
	            String str = br.readLine().trim();
	            int len = Integer.parseInt(br.readLine());
	            str = str.replaceAll(" ","%20");
	            System.out.println(str);
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	 }
}