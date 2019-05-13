import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
//import javax.sound.midi.Patch;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class patterns_regex
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        Pattern pat = Pattern.compile("[a|e|i|o|u]");
        Matcher m = pat.matcher(st);
        while(m.find())
        {
            count++;
        }
        System.out.print(count);
    }
}