// Q : https://practice.geeksforgeeks.org/problems/non-repeating-element/0/?track=sp-hashing

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    while(T-- > 0)
	    {
	        long n = s.nextLong();
	        LinkedHashMap<Long,Integer> hmap = new LinkedHashMap<Long,Integer>();
	        boolean flag = false;
	        for(int i=0; i<n; i++)
	        {
	            long num = s.nextLong();
	            if(hmap.get(num)==null)
	            {
	                hmap.put(num,1);
	            }
	            else
	            {
	                hmap.put(num,hmap.get(num)+1);
	            }
	        }
	        
	        for(Map.Entry m: hmap.entrySet())
	        {
	            int count = (int)m.getValue();
	            if(count==1)
	            {
	                System.out.println((Long)m.getKey());
	                flag=true;
	                break;
	            }
	        }
	        if(!flag)
	        {
	            System.out.println(0);
	        }
	    }
	 }
}