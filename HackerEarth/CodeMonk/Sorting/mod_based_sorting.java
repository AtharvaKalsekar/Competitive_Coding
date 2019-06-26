// Q : https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/monk-and-modulo-based-sorting/

import java.util.*;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[n];
        int[] sorted = new int[n];
        int[] mod = new int[k];
        for(int i=0; i<n; i++)
        {
            a[i] = s.nextInt();
            int rem = a[i]%k;
            mod[rem]++;
        }
        for(int i=1; i<k; i++)
        {
            mod[i]+=mod[i-1];
        }
        for(int i=n-1; i>=0; i--)
        {
            int rem = a[i]%k;
            int pos = mod[rem];
            sorted[pos-1] = a[i];
            mod[rem]--;
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(sorted[i]+" ");
        }
    }
}