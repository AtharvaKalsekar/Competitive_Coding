// Q : https://practice.geeksforgeeks.org/problems/find-k-th-character-in-string/0/?track=string-interview

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
	            String[] str = br.readLine().split(" ");
	            int num = Integer.parseInt(str[0]);
	            int k = Integer.parseInt(str[1]);
	            int n = Integer.parseInt(str[2]);
	            String binary =  Integer.toBinaryString(num);
	            for(int i=0; i<n; i++)
	            {
	                String temp = binary.replaceAll("0","0x");
	                temp = temp.replaceAll("1","10");
	                binary = temp.replaceAll("x","1");
	            }
	            
	            System.out.println(binary.charAt(k));
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	 }
}