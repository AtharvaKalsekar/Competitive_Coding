// Q : https://practice.geeksforgeeks.org/problems/number-of-open-doors/0/?track=sp-mathematics&batchId=152

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    static boolean perfectSq(long n)
    {
        double sq = Math.sqrt(n);
        return (sq-Math.floor(sq))<0.000001;
    }
	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    while(T-- > 0)
	    {
	        long n = s.nextLong();
	        int count=0;
	        //floor(sqrt(b))-ceil(sqrt(a))+1
	        System.out.println((int)Math.floor(Math.sqrt(n)));
	    }
	}
}