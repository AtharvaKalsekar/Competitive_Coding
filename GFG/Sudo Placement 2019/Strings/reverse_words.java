// Q : https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0/?track=sp-strings&batchId=152

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
	        
	        String[] word = br.readLine().split("\\.");
	        
	        StringBuilder sb = new StringBuilder();
	        int l = word.length;
	        for(int i=l-1; i>=0; i--)
	        {
	            sb.append(word[i]);
	            sb.append(".");
	        }
	        sb.deleteCharAt(sb.length()-1);
	        System.out.println(sb);
	        
	    }
	}
}