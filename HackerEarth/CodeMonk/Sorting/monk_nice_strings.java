// Q : https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/practice-problems/algorithm/monk-and-nice-strings-3/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            str[i] = br.readLine();
        }
        a[0]=0;
        for(int i=1; i<n; i++)
        {
            for(int j=i-1; j>=0; j--)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    a[i]++;
                   //break;
                }
            }
        }
        
        for(int k : a)
        {
            System.out.println(k);
        }
    }
}