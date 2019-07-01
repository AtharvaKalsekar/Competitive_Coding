// Q : https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/circular-distance-3/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] d = new double[n];
        for(int i=0; i<n; i++)
        {
            String[] t = br.readLine().split(" ");
            double x = Double.parseDouble(t[0]);
            double y = Double.parseDouble(t[1]);
            d[i] = Math.sqrt(x*x+y*y);
        }
        Arrays.sort(d);
        int q = Integer.parseInt(br.readLine());
        while(q-- > 0)
        {
       
            long r = Long.parseLong(br.readLine());
            int pos = Arrays.binarySearch(d,r);
            while(pos>=0 && pos<n)
            {
                pos = Arrays.binarySearch(d,pos+1,n,r);
            }
            pos = Math.abs(pos+1);
            
            if(pos==n)
            {
                System.out.println(n);
            }
            else
            {
                System.out.println(pos);
            }
        }
    }
}
