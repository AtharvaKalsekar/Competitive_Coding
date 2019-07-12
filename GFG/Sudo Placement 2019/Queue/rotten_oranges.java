// Q : https://practice.geeksforgeeks.org/problems/rotten-oranges/0/?track=sp-queue&batchId=152

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
        
        Cell(int x, int y, int d)
        {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
    
    static boolean isSafe(int i, int j, int r, int c)
    {
        return (i>=0 && i<r) && (j>=0 && j<c);
    }
    
	public static void main (String[] args)
	{
	    try
	    {
	        InputStreamReader in = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(in);
	   
    	    int T = Integer.parseInt(br.readLine());
    	    while(T-- > 0)
    	    {
    	        String[] dims = br.readLine().split(" ");
    	        int r = Integer.parseInt(dims[0]);
    	        int c = Integer.parseInt(dims[1]);
    	        int[][] a = new int[r][c];
    	        int[] dx = {-1,0,1,0};
    	        int[] dy = {0,-1,0,1};
    	        Queue<Cell> q = new LinkedList<Cell>();
    	        int level = 0;
    	        int count_1 = 0;
    	        String[] oranges = br.readLine().split(" ");
    	        int k=0;
    	        for(int i=0; i<r; i++)
    	        {
    	            for(int j=0; j<c; j++)
    	            {
    	                int num = Integer.parseInt(oranges[k++]);
    	                if(num==2)
    	                {
    	                    
    	                    q.add(new Cell(i,j,0));
    	                }
    	                else if(num == 1)
    	                {
    	                    count_1 ++;
    	                }
    	                a[i][j]=num;
    	            }
    	        }
    	        if(q.isEmpty())
    	        {
    	            System.out.println("-1");
    	            continue;
    	        }
    	        while(!q.isEmpty())
    	        {
    	            Cell t = q.poll();
    	            
    	            int curr_x = t.x;
    	            int curr_y = t.y;
    	            level = Math.max(level,t.d);
    	            
    	            for(int i=0; i<4; i++)
    	            {
    	                int next_x = curr_x + dx[i];
    	                int next_y = curr_y + dy[i];
    	                if(isSafe(next_x,next_y,r,c) && a[next_x][next_y]==1)
    	                {
    	            
    	                    q.add(new Cell(next_x,next_y,t.d+1));
    	                    a[next_x][next_y]=2;
    	                    count_1--;
    	                }
    	            }
    	        }
    	        if(count_1 == 0)
    	        {
    	            System.out.println(level);
    	        }
    	        else
    	        {
    	            System.out.println("-1");
    	        }
    	    }
	    }
	    catch(IOException e)
	    {
	        
	    }
	}
}