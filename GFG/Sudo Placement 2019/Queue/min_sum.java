// Q : https://practice.geeksforgeeks.org/problems/min-sum-formed-by-digits/0/?track=sp-queue
// use PrioQueue
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
	        int n = s.nextInt();
	        int[] a = new int[n];
	        for(int i=0; i<n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        Arrays.sort(a);
	        long num1 = 0;
	        long num2 = 0;
	        for(int i=0;i<n;i++)
	        {
	            if(i%2==0)
	            {
	                num1 = 10*num1 + a[i];
	            }
	            else
	            {
	                num2 = 10*num2 + a[i];
	            }
	        }
	        System.out.println(num1+num2);
	    }
	}
}