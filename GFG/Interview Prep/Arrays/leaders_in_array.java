//Q: https://practice.geeksforgeeks.org/problems/leaders-in-an-array/0/?track=interview-arrays&batchId=117
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    
	    
	    try
	   {
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    while(T-- > 0)
	    {
	        
	            
	            int n = Integer.parseInt(br.readLine());//s.nextInt();
	            String[] sta = new String[n];
	            sta = br.readLine().split(" ");
	            
	           
	            int max = Integer.parseInt(sta[n-1]);
	            //String str = String.valueOf(sta[n-1]);
	            
	            ArrayList<Integer> al = new ArrayList<Integer>();
	            al.add(max);
	            int curr = Integer.MIN_VALUE;
	            for(int i=n-2; i>=0; i--)
	            {
	                curr = Integer.parseInt(sta[i]);
	                if(curr>=max)
	                {
	                    //str = curr+" "+str;
	                    al.add(curr);
	                    max=curr;
	                }
	            }
	            
                //this saves from TLE
	            StringBuffer str = new StringBuffer();
	            for(int j=al.size()-1; j>=0;j--)
	            {
	                str.append(al.get(j)+" ");
	            }
	            
	            System.out.println(str);
	        
	        
	        
	    }
	   }
	   catch(IOException e)
	        {
	            
	        }
	 }
}