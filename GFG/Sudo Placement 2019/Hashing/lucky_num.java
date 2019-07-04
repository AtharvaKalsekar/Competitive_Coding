// Q : https://practice.geeksforgeeks.org/problems/lucky-number/0/?track=sp-hashing

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
	        String st = s.nextLine();
	        int n = st.length();
	        HashSet<Long> hs = new HashSet<Long>();
	        boolean flag = false;
	        
	        for(int i=0;i<n;i++)
	        {
	            long prod = (st.charAt(i)-'0');
	            //System.out.println(prod);
	            if(hs.contains(prod))
	            {
	                flag = true;
	                break;
	            }
	            else
	            {
	                hs.add(prod);
	            }
	            for(int j=i+1;j<n;j++)
	            {
	                prod = prod*(st.charAt(j)-'0');
	                //System.out.println(prod);
	                if(hs.contains(prod))
	                {
	                    flag = true;
	                    break;
	                }
	                else
	                {
	                    hs.add(prod);
	                }
	            }
	            if(flag)
	            {
	                break;
	            }
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