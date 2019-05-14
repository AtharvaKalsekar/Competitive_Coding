//https://practice.geeksforgeeks.org/problems/remove-duplicates-from-unsorted-array/0/?track=interview-arrays
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    for(int i=1; i<=T; i++)
	    {
	        int N = s.nextInt();
	        boolean[] b = new boolean[101];
	        int[] a = new int[N];
	        for(int j=0; j<N; j++)
	        {
	            int num = s.nextInt();
	            if(!b[num])
	            {
	                a[j]=num;
	                b[num] = true;
	            }
	            
	        }
	        
	        for(int j : a)
	        {
	            if(j!=0)
	            {
	                System.out.print(j+" ");
	            }
	        }
	        System.out.println();
	    }
	 }
}