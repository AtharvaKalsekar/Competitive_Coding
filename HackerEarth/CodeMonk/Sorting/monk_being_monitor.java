// Q : https://www.hackerearth.com/problem/algorithm/monk-being-monitor/

import java.util.*;

class TestClass
{
    public static void main(String args[] ) throws Exception 
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
            int min = Arrays.stream(a).min().getAsInt();
            int max = Arrays.stream(a).max().getAsInt();
            int[] hash = new int[max-min+1];
            for(int i=0; i<n; i++)
            {
                int v = a[i]-min;
                hash[v]++;
            }
            int minH = Arrays.stream(hash).min().getAsInt();
            int maxH = Arrays.stream(hash).max().getAsInt();
            System.out.println(maxH-minH-1);
        }
    }
}