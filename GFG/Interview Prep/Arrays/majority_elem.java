//Q : https://practice.geeksforgeeks.org/problems/majority-element/0/?track=interview-arrays&batchId=117
//Editorial : https://www.geeksforgeeks.org/majority-element/

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
	        int N = s.nextInt();
	        int count = Integer.MIN_VALUE;
	        int maxNumber = 0;
	        int[] hash = new int[1000001];
	 //       Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i=0; i<N; i++)
	        {
	            int num = s.nextInt();
	            hash[num]+=1;
	            if(hash[num]>count)
	            {
	                    maxNumber = num;
	                    count = hash[num];
	            }
	            /*
	            if(!map.containsKey(num))
	            {
	                map.put(num,1);
	            }
	            else
	            {
	                map.replace(num,map.get(num)+1);
	                if(map.get(num)>count)
	                {
	                    maxNumber = num;
	                    count = map.get(num);
	         //           System.out.println(maxNumber+" "+count);
	                }
	            }
	            */
	        }
	       // System.out.println(map);
	        if(count>N/2)
	        {
	            System.out.println(maxNumber);
	        }
	        else
	        {
	            System.out.println("-1");
	        }
	    }
	 }
}