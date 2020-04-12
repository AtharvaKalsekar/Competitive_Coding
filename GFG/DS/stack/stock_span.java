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
	        String[] st = br.readLine().split(" ");
	        int[] a = Arrays.stream(st).mapToInt(Integer::parseInt).toArray();
	        
	        int[] s = new int[n];
	        s[0]=1;
	        
	        Stack<Integer> stk = new Stack<Integer>();
	        stk.push(0);
	        
	        for(int i=1; i<n; i++)
	        {
	            while(!stk.empty() && a[stk.peek()]<=a[i])
	            {
	                stk.pop();
	            }
	            
	            s[i] = (stk.empty())? (i+1) : (i-stk.peek());
	            stk.push(i);
	        }
	        for(int x : s)
	        {
	             System.out.print(x+" ");
	        }
	        System.out.println();
	    }
	    
	}
}