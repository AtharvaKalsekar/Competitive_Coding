import java.util.*;
import java.io.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        int q = s.nextInt();
        
        for(int i=0;i<q;i++)
        {
            int k=s.nextInt();
            int pos = Arrays.binarySearch(a,k);
            /*
            i
            f(pos>=0)
            {
                while(pos+1<n && a[pos+1]==k)
                {
                    pos++;
                }
            }
            */
            int old_pos=pos;
            while(pos>0 && pos<n-1)
            {
                pos = Arrays.binarySearch(a,old_pos+1,n,k);
                if(pos>=0)
                {
                    old_pos=pos;
                }
            }
            System.out.println(Math.abs(old_pos+1));
        }
        
        
    }
}
