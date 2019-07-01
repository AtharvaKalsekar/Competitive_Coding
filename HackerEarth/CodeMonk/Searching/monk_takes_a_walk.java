// Q : https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/monk-takes-a-walk/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Pattern pattern = Pattern.compile("(a{1}|e{1}|i{1}|o{1}|u{1})");
        while(T-- > 0)
        {
            String s = br.readLine().toLowerCase();
            //System.out.println(s);
            Matcher matcher = pattern.matcher(s);
            int count = 0;
            while(matcher.find())
            {
                count+=1;
                //System.out.println(matcher.group());
            }
            System.out.println(count);
        }
    }
}