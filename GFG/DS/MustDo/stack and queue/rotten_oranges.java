// https://practice.geeksforgeeks.org/problems/rotten-oranges/0
// c.m.s

import java.lang.*;
import java.io.*;

class GFG
{
    static class Ele
    {
        int row;
        int col;
        
        Ele(int row, int col)
        {
            this.row = row;
            this.col = col;
        }
    }
    
    static boolean isMarker(Ele t)
    {
        return (t.row==-1) && (t.col==-1);
    }
    
    static boolean isSafe(int[][] g, int i, int j, int r, int c)
    {
        return (i>=0 && i<r) && (j>=0 && j<c) && (g[i][j]==1);
    }
    
    static boolean isPossible(int[][] g, int r, int c)
    {
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(g[i][j]==1)
                {
                    return false;
                }
            }
        }
        return true;
    }
	public static void main (String[] args) throws IOException
	{
	    InputStreamReader in = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(in);
	    int T = Integer.parseInt(br.readLine());
	    int[] rowN = {-1,0,1,0};
	    int[] colN = {0,1,0,-1};
	    
	    while(T-- > 0)
	    {
	        String[] dims = br.readLine().split(" ");
	        int r = Integer.parseInt(dims[0]);
	        int c = Integer.parseInt(dims[1]);
	        String[] nums = br.readLine().split(" ");
	        int[][] g = new int[r][c];
	        int k=0;
	        int count = 0;
	        
	        LinkedList<Ele> q = new LinkedList<Ele>();
	        for(int i=0; i<r; i++)
	        {
	            for(int j=0; j<c; j++)
	            {
	                g[i][j] = Integer.parseInt(nums[k+j]);
	                if(g[i][j]==2)
	                {
	                   q.add(new Ele(i,j)); 
	                }
	            }
	            k+=c;
	        }
	        q.add(new Ele(-1,-1));
	        
	        while(q.size()!=0)
	        {
	            if(isMarker(q.getFirst()))
	            {
	                q.remove();
	                if(q.size()!=0)
	                {
	                    count++;
	                    q.add(new Ele(-1,-1));
	                }
	            }
	            else
	            {
	                Ele curr = q.poll();
	                for(int i=0 ;i<4; i++)
	                {
	                    int newR = curr.row + rowN[i];
	                    int newC = curr.col + colN[i];
	                    
	                    if(isSafe(g,newR,newC,r,c))
	                    {
	                        g[newR][newC] = 2;
	                        q.add(new Ele(newR,newC));
	                    }
	                }
	            }
	        }
	        
	        int ans = isPossible(g,r,c)?count:-1;
	        System.out.println(ans);
	    }
	}
}