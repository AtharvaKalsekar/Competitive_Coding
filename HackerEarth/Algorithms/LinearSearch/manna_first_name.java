// Q : https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/mannas-first-name-4/

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
        Pattern pattern = Pattern.compile("(SUVOJIT|SUVO)");
     
        while(n-- > 0)
        {
            String s = br.readLine().toString();
            int suvojit = 0;
            int suvo = 0;
            Matcher matcher = pattern.matcher(s);
            while(matcher.find())
            {
                //System.out.println(matcher.group());
                if(matcher.group().equals("SUVOJIT"))
                {
                    suvojit++;   
                }
                else
                {
                    suvo++;
                }
            }
            System.out.println("SUVO = "+suvo+", "+"SUVOJIT = "+suvojit);
        }

    }
}