// Q : https://practice.geeksforgeeks.org/problems/anagram-palindrome/0/?track=string-interview

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
	            String str = br.readLine();
	           // System.out.println(str);
	            boolean flag = false;
	            int[] a = new int[26];
	            int length = str.length();
	            for(int i=0; i<length; i++)
	            {
	                char c = str.charAt(i);
	                a[c-'a']++;
	            }
	            if(length%2==0)
	            {
	                for(int i=0; i<26; i++)
	                {
	                    //System.out.print(a[i]);
	                    if(a[i]%2 != 0)
	                    {
	                        System.out.println("No");
	                        flag = true;
	                        break;
	                    }
	                }
	                if(!flag)
	                {
	                    System.out.println("Yes");
	                }
	                
	            }
	            else
	            {
	                for(int i=0; i<26; i++)
	                {
	                    //System.out.print(a[i]);
	                    if(a[i]%2 != 0)
	                    {
	                        if(flag)
	                        {
	                            System.out.println("No");
	                            flag = false;
	                            break;    
	                        }
	                        flag = true;
	                    }
	                }
	                if(flag)
	                {
	                    System.out.println("Yes");
	                }
	            }
	            
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	 }
}