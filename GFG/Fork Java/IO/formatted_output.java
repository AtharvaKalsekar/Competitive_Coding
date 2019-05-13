import java.text.DecimalFormat;
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks{
    
    static void printInFormat(float a, float b){
        float result = a/b;
        
        DecimalFormat ft1 = new DecimalFormat("#.###");
        
        System.out.println(result +" "+ft1.format(result));
        // Your code here to print upto 3 decimal places
        
    }    
    
}