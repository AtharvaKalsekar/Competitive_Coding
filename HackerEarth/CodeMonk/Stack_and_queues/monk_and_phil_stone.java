// Q : https://www.hackerearth.com/challenges/competitive/codemonk-stacks-queues-1/algorithm/monk-and-philosophers-stone/

import java.util.*;

class TestClass
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = s.nextInt();
        }
        int q = s.nextInt();
        int X = s.nextInt();
        s.nextLine();
        long sum = 0;
        Stack<Integer> stk = new Stack<Integer>();
        int j=0;
        boolean flag = false;
        for(int i=0; i<q; i++)
        {
            String inst = s.nextLine();
            if(inst.equals("Harry"))
            {
                sum = sum + a[j];
                stk.push(a[j]);
                j++;
    
                if(sum == X)
                {
                    flag = true;
                    break;
                }
                
                
                if(j==n)
                {
                    break;
                }
                
            }
            else
            {
                
                if(!stk.empty())
                {
                    sum = sum - stk.pop();
                }
                
                if(sum==X)
                {
                    flag = true;
                    break;
                }
                
            }
        }
        if(flag)
        {
            System.out.println(stk.size());
        }
        else
        {
            System.out.println("-1");
        }
        
        
    }
}
