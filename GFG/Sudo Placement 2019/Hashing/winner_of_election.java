// Q : https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names/0/?track=sp-hashing&batchId=152

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
                int n = Integer.parseInt(br.readLine());
                String[] names = br.readLine().split(" ");
                TreeMap<String,Integer> tmap = new TreeMap<String,Integer>();
                for(int i=0; i<n; i++)
                {
                    if(tmap.get(names[i])==null)
                    {
                        tmap.put(names[i],1);
                    }
                    else
                    {
                        tmap.put(names[i],tmap.get(names[i])+1);
                    }
                }
                int max = 0;
                String can = "";
                for(Map.Entry m: tmap.entrySet())
                {
                    //System.out.println(m.getKey().getClass().getName()+" "+m.getValue().getClass().getName());
                    
                    if(((int)m.getValue())>max)
                    {
                        max = (int)m.getValue();
                        can = (String)m.getKey();
                    }
                }
                System.out.println(can+" "+max);
            }
	    }
	    catch(IOException e)
	    {
	        
	    }
	 }
}