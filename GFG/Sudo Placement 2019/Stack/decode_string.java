// Q : https://practice.geeksforgeeks.org/problems/decode-the-string/0/?track=sp-stack&batchId=152

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
	            String str = br.readLine();
	            int l = str.length();
	            Stack<Integer> stk1 = new Stack<Integer>();
	            Stack<Character> stk2 = new Stack<Character>();
	            String res = "";
	            String temp = "";
	            for(int i=0; i<l;i++)
	            {
	                int count = 0;
	                if(Character.isDigit(str.charAt(i)))
	                {
	                    while(Character.isDigit(str.charAt(i)))
	                    {
	                        count = 10*count + (str.charAt(i)-'0');
	                        i++;
	                    }
	                    i--;
	                    stk1.push(count);
	                }
	                else if(str.charAt(i)==']')
	                {
	                    temp = "";
	                    count = stk1.pop();
	                    
	                    while(!stk2.empty() && stk2.peek()!='[')
	                    {
	                        temp = stk2.pop() + temp;
	                    }
	                    if(!stk2.empty() && stk2.peek()=='[')
	                    {
	                        stk2.pop();
	                    }
	                    
	                    for(int k=0; k<count; k++)
	                    {
	                        res = res + temp;
	                    }
	                    
	                    for(int j=0; j<res.length(); j++)
	                    {
	                        stk2.push(res.charAt(j));
	                    }
	                    res="";
	                }
	                else
	                {
	                    stk2.push(str.charAt(i));
	                }
	            }
	            while(!stk2.empty())
	            {
	                res = stk2.pop() + res;
	            }
	            System.out.println(res);
	        }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}