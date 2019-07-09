// Q : https://practice.geeksforgeeks.org/problems/parenthesis-checker/0/?track=sp-stack&batchId=152

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
	            Stack<Character> stk = new Stack<Character>();
	            boolean flag = false;
	            for(int i=0; i<l; i++)
	            {
	                char c = exp.charAt(i);
	                switch(c)
	                {
	                    case '(':
	                    case '[':
	                    case '{':
	                        stk.push(c);
	                        break;
	                    case ')':
	                        if(!stk.empty() && stk.peek()=='(')
	                        {
	                            stk.pop();
	                        }
	                        else
	                        {
	                            flag=true;
	                            break;
	                        }
	                        break;
	                    case ']':
	                        if(!stk.empty() && stk.peek()=='[')
	                        {
	                            stk.pop();
	                        }
	                        else
	                        {
	                            flag=true;
	                            break;
	                        }
	                        break;
	                    case '}':
	                        if(!stk.empty() && stk.peek()=='{')
	                        {
	                            stk.pop();
	                        }
	                        else
	                        {
	                            flag=true;
	                            break;
	                        }
	                        break;
	                }
	                
	            }
	            if(!flag && stk.empty())
                {
                    System.out.println("balanced");
                }
                else
                {
                    System.out.println("not balanced");
                }
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}