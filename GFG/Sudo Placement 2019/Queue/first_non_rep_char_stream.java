// Q : https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream/0/?track=sp-queue&batchId=152

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
	            int n = Integer.parseInt(br.readLine());
	            char[] elems = br.readLine().replaceAll(" ","").toCharArray();
	            int[] h = new int[26];
	            Arrays.fill(h,-1);
	            StringBuffer sb = new StringBuffer();
	            Queue<Character> q = new LinkedList<Character>();
	          //  LinkedList<Character> ll = new LinkedList<Character>();
	            for(char c:elems)
	            {
	                int index = c-'a';
	                q.add(c);
	                h[index]++;
	                while(!q.isEmpty())
	                {
	                    if(h[q.peek()-'a']>0)
	                    {
	                        q.remove();
	                    }
	                    else
	                    {
	                        sb.append(q.peek()+" ");
	                        break;
	                    }
	                }
	                if(q.isEmpty())
	                {
	                     sb.append("-1 ");
	                }
	                /*
	                if(h[index]==-1)
	                {
	                    ll.add(c);
	                    
	                    h[index]++;
	                }
	                else
	                {
	                    if(ll.contains(c))
	                    {
	                        int ind = ll.indexOf(c);
	                        ll.remove(ind);
	                        //System.out.println(c);
	                    }
	                }
	                if(ll.size()!=0)
	                {
	                    sb.append(ll.get(0)+" ");
	                }
	                else
	                {
	                    sb.append("-1 ");
	                }
	                */
	                
	            }
	            
	            System.out.println(sb);
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}