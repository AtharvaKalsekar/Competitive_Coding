// Q : https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression/0/?track=sp-stack&batchId=152

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
	            String exp = br.readLine();
	            int l = exp.length();
	            Stack<Integer> stk = new Stack<Integer>();
	            for(int i=0; i<l; i++)
	            {
	                char c = exp.charAt(i);
	                if(c!='*' && c!='/' && c!='+' && c!='-')
	                {
	                    stk.push(c-'0');
	                }
	                else if(!stk.empty())
	                {
	                    int n1 = stk.pop();
	                    int n2 = stk.pop();
	                    switch(c)
	                    {
	                        case '+':
	                            stk.push(n2+n1);
	                            break;
	                        case '-':
	                            stk.push(n2-n1);
	                            break;
	                        case '*':
	                            stk.push(n2*n1);
	                            break;
	                        case '/':
	                            stk.push(n2/n1);
	                            break;
	                    }
	                }
	            }
	            System.out.println(stk.pop());
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}