// Q : https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/monk-and-search-2/description/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(a);
        int q = Integer.parseInt(br.readLine());
        int[] qt = new int[q];
        int[] qv = new int[q];
        for(int i=0; i<q; i++)
        {
            String[] t = br.readLine().split(" ");
            qt[i] = Integer.parseInt(t[0]);
            qv[i] = Integer.parseInt(t[1]);
        }
        for(int i=0;i<q;i++)
        {
            int pos = Arrays.binarySearch(a,qv[i]);
            if(qt[i]==0)
            {
                while(pos>=0 && pos<n)
                {
                    pos = Arrays.binarySearch(a,0,pos,qv[i]);
                }
            }
            else
            {
                while(pos>=0 && pos<n)
                {
                    pos = Arrays.binarySearch(a,pos+1,n,qv[i]);
                }
            }
            pos = Math.abs(pos+1);
            int j = pos;
            if(j==n)
            {
                System.out.println("0");
                continue;
            }
            System.out.println(n-j);
            
        }
    }
}
