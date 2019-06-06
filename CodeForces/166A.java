// Q : https://codeforces.com/problemset/problem/166/A
import java.util.*;

public class MyClass {
    
    public static class Contestant
    {
        int p;
        int t;
        Contestant(int p, int t)
        {
            this.p = p;
            this.t = t;
        }
    }
    
    public static Comparator<Contestant> comp =new Comparator<Contestant>(){
        @Override
        public int compare(Contestant a, Contestant b)
        {
            if(b.p>a.p || (b.p==a.p && b.t<a.t))
            {
                return 1;
            }
            else if(b.p==a.p && b.t==a.t)
            {
                return 0;
            }
            return -1;
        }
    };
    
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        Contestant[] a = new Contestant[n];
        for(int i=0; i<n; i++)
        {
            a[i] = new Contestant(s.nextInt(),s.nextInt());
        }
        Arrays.sort(a,comp);
        /*for(int i=0; i<n; i++)
        {
            System.out.println(a[i].p+" "+a[i].t);
        }*/
        int prs = a[k-1].p;
        int tim = a[k-1].t;
        int count=1;
        for(int i=k-2;i>=0;i--)
        {
            if(a[i].p==prs && a[i].t==tim)
            {
              count++;  
            }
        }
        for(int i=k; i<n; i++)
        {
            if(a[i].p==prs && a[i].t==tim)
            {
              count++;  
            }
        }
        System.out.println(count);
    }
}