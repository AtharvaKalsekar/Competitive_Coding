// Q : https://practice.geeksforgeeks.org/problems/uncommon-characters/0/?track=string-interview

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
	            String s1 = br.readLine();
	            String s2 = br.readLine();
	            int[] hash1 = new int[26];
	            int[] hash2 = new int[26];
	            int l1 = s1.length();
	            int l2 = s2.length();
	            for(int i=0; i<l1; i++)
	            {
	                hash1[s1.charAt(i)-'a']++;
	            }
	            for(int i=0; i<l2; i++)
	            {
	                hash2[s2.charAt(i)-'a']++;
	            }
	            
	            for(int i=0; i<26; i++)
	            {
	                if((hash1[i]>0 && hash2[i]==0)||(hash1[i]==0 && hash2[i]>0))
	                {
	                    char c = (char)('a'+i);
	                    System.out.print(c);
	                }
	            }
	            
	            System.out.println();
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	 }
}