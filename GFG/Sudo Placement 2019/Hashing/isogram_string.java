// Q : https://practice.geeksforgeeks.org/problems/check-if-a-string-is-isogram-or-not/0/?track=sp-hashing

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    s.nextLine();
	    while(t-- > 0)
	    {
	        String st = s.nextLine().toLowerCase();
	        int l = st.length();
	        boolean flag = false;
	        //int[] a = new int[26];
	        HashSet<Character> hs = new HashSet<Character>();
	        for(int i=0; i<l; i++)
	        {
	            char c = st.charAt(i);
	            //int pos = c-'a';
	            if(hs.contains(c))
	            {
	                flag = true;
	                break;
	            }
	            else
	            {
	                hs.add(c);
	            }
	            /*
	            if(a[pos]>=1)
	            {
	                flag = true;
	                break;
	            }
	            else
	            {
	                a[pos]++;
	            }
	            */
	        }
	        if(flag)
	        {
	            System.out.println("0");
	        }
	        else
	        {
	            System.out.println("1");
	        }
	    }
	 }
}