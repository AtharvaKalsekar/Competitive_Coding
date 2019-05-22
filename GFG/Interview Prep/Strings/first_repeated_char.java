// Q : https://practice.geeksforgeeks.org/problems/find-first-repeated-character/0/?track=string-interview
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    InputStreamReader in = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(in);
	    try
	    {
	        int T = Integer.parseInt(br.readLine());
	        while(T-- > 0)
	        {
	            String str = br.readLine();
	            int[] a = new int[26];
	            int len = str.length();
	            boolean flag = false;
	            for(int i=0; i<len; i++)
	            {
	                int index = str.charAt(i)-'a';
	                a[index]++;
	                if(a[index]==2)
	                {
	                    System.out.println(str.charAt(i));
	                    flag = true;
	                    break;
	                }
	                
	            }
	            if(!flag)
	            {
	                System.out.println("-1");
	            }
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	 }
}