// Q : https://www.hackerearth.com/problem/algorithm/monk-and-suffix-sort/

import java.util.*;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        String st[] = s.nextLine().split(" ");
        int k = Integer.parseInt(st[1]);
    
        int len = st[0].length();
        String[] suffix = new String[len];
        for(int i=0; i<len; i++)
        {
            suffix[i] = st[0].substring(i,len);
        }
        Arrays.sort(suffix);
        System.out.println(suffix[k-1]);
        
    }
}