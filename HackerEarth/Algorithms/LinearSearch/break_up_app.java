// Q : https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/breakup-app/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[32];
        Pattern pattern = Pattern.compile("[1-9][0-9]?");
        int max = 0;
        int maxDate = 0;
        for(int i=1; i<=n; i++)
        {
            String s = br.readLine().toString();
            Matcher matcher = pattern.matcher(s);
            if(s.charAt(0)=='G')
            {
                while(matcher.find())
                {
                    //System.out.println(matcher.group());
                    int day = Integer.parseInt(matcher.group());
                    a[day] += 2;
                    if(a[day]>max)
                    {
                        max = a[day];
                        maxDate = day;
                    }
                    
                }
            }
            else
            {
                while(matcher.find())
                {
                    //System.out.println(matcher.group());
                    int day = Integer.parseInt(matcher.group());
                    a[day] += 1;
                    if(a[day]>max)
                    {
                        max = a[day];
                        maxDate = day;
                    }
                    
                }
            }
        }
        if(maxDate==19 || maxDate==20)
        {
            System.out.println("Date");
        }
        else
        {
            System.out.println("No Date");
        }

    }
}
