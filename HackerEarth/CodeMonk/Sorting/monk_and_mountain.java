// Q : https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/little-monk-and-mountains/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t1 = br.readLine().split(" ");
        int n = Integer.parseInt(t1[0]);
        int q = Integer.parseInt(t1[1]);
        long[] l = new long[n];
        long[] r = new long[n];
        long[] d = new long[n];
        
        String[] t2 = br.readLine().split(" ");
        l[0] = Long.parseLong(t2[0]);
        r[0] = Long.parseLong(t2[1]);
        d[0] = r[0]-l[0]+1;
        
        for(int i=1; i<n; i++)
        {
            t2 = br.readLine().split(" ");
            l[i] = Long.parseLong(t2[0]);
            r[i] = Long.parseLong(t2[1]);
            d[i] = d[i-1]+r[i]-l[i]+1;
        }
        
        while(q-- > 0)
        {
            long h = Long.parseLong(br.readLine());
            int pos = Arrays.binarySearch(d,h);
            pos = Math.abs(pos+1);
            if(pos==n)
            {
                pos--;
            }
            long lb = l[pos];
            long rb = r[pos];
            if(pos!=0)
            {
                long res = l[pos]+h-d[pos-1]-1;
                System.out.println(res);
            }
            else
            {
                long res = l[pos]+h-1;
                System.out.println(res);
            }
        }
        
    }
}
