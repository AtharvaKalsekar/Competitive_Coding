// Q : https://codeforces.com/contest/492/problem/B

import java.util.*;
import java.io.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int l = s.nextInt();
        double[] a = new double[n];
        double[] diff = new double[n];
        double maxdiff = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            a[i]=s.nextDouble();
        }
        Arrays.sort(a);
        diff[0]=a[0]-0;
        //maxdiff = diff[0];
        double initialdiff = diff[0];
        for(int i=1;i<n;i++)
        {
            diff[i]=a[i]-a[i-1];
            if(diff[i]>maxdiff)
            {
                maxdiff=diff[i];
            }
        }
        double finaldiff = l-a[n-1];
        double grt = Math.max(initialdiff,finaldiff);
        if(grt>=maxdiff/2)
        {
            System.out.print((double)grt);
        }
        else
        {
            System.out.print((double)maxdiff/2);
        }
    }
}
