// Q : https://practice.geeksforgeeks.org/problems/steps-by-knight/0/?track=sp-queue&batchId=152

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    static class Cell
    {
        int x;
        int y;
        int d;
        
        Cell(int x,int y,int d)
        {
            this.x=x;
            this.y=y;
            this.d=d;
        }
    }
    static boolean isSafe(int x, int y, int n)
    {
        return (x>=1 && x<=n) && (y>=1 && y<=n);
    }
	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    while(T-- > 0)
	    {
	        int n = s.nextInt();
	        boolean[][] visited = new boolean[n+1][n+1];
	        Queue<Cell> q = new LinkedList<Cell>();
	        int[] dx = {-2, -1, 1, 2, -2, -1, 1, 2};
	        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
	        int x_k = s.nextInt();
	        int y_k = s.nextInt();
	        int x_t = s.nextInt();
	        int y_t = s.nextInt();
	        visited[x_k][y_k]=true;
	        Cell curr = new Cell(x_k,y_k,0);
	        q.add(curr);
	        boolean flag=false;
	        while(!q.isEmpty())
	        {
	            //System.out.println("HELLo");
	            Cell t = q.poll();
	            int x_curr = t.x;
	            int y_curr = t.y;
	            //System.out.println(x_curr+","+y_curr);
	            if(x_curr==x_t && y_curr==y_t)
	            {
	                System.out.println(t.d);
	                flag=true;
	                break;
	            }
	            for(int i=0; i<8; i++)
	            {
	                int x_next = x_curr+dx[i];
	                int y_next = y_curr+dy[i];
	                if(isSafe(x_next,y_next,n) && !visited[x_next][y_next])
	                {
	                    q.add(new Cell(x_next, y_next, t.d+1));
	                    visited[x_next][y_next]=true;
	                }
	            }
	            
	        }
	        if(!flag)
	        {
	            System.out.println("-1");
	        }
	    }
	}
}