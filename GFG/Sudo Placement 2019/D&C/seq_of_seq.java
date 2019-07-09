// Q : https://practice.geeksforgeeks.org/problems/sequence-of-sequence/0/?track=dp-divide-and-conquer&batchId=152
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
	        int m = s.nextInt();
	        int n = s.nextInt();
	        System.out.println(getSeq(m,n));
	    }
	}
	
	static int getSeq(int m, int n)
	{
	    if(m<n)
	    {
	        return 0;
	    }
	    if(n==0)
	    {
	        return 1;
	    }
	    return getSeq(m-1,n)+getSeq(m/2,n-1);
	}
}