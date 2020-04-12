// https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream/0
import java.util.*;
import java.lang.*;
import java.io.*;


class GFG
{
	public static void main (String[] args) throws IOException
	{
	    InputStreamReader inp = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(inp);
	    int T = Integer.parseInt(br.readLine());
	    while(T-->0)
	    {
	        int n = Integer.parseInt(br.readLine());
	        String[] a = br.readLine().split(" ");
	        LinkedHashSet<String> single = new LinkedHashSet<String>();
	        HashSet<String> extra = new HashSet<String>();
	        StringBuilder sb = new StringBuilder();
	        
	        for(String x : a)
	        {
	            
	            if(single.contains(x))
	            {
	                single.remove(x);
	                extra.add(x);
	            }
	            else
	            {
	                single.add(x);
	            }
	            
	            if(single.size()==0)
	            {
	                sb.append("-1 ");
	            }
	            else
	            {
	                boolean flag = false;
	                for(String st : single)
	                {
	                    if(!extra.contains(st))
	                    {
	                        sb.append(st+" ");
	                        flag = true;
	                        break;
	                    }
	                    
	                }
	                if(!flag)
	                {
	                    sb.append("-1 ");    
	                }
	                
	            }
	           
	        }
	        System.out.println(sb);
	        
	    }
	}
}