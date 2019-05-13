/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//Link : https://practice.geeksforgeeks.org/problems/taking-input-java/1/?track=module-1-basics-and-control-structures-java&batchId=114


import java.io.*;
//User function Template for Java
class Geeks{
    
    // Function to take input using Scanner class
    static void IOFunction() {
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
//        Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    String a = br.readLine();
		    String b = br.readLine();
		    String c = br.readLine();
		    String d = br.readLine();
		    String s = br.readLine();
		    
		   
		   // int a = 
		    System.out.println(Integer.parseInt(a));
		    System.out.println(Float.parseFloat(b));
		    System.out.println(Long.parseLong(c));
		    System.out.println(Byte.parseByte(d));
		    System.out.println(s);
		    
		}
        }
        catch(IOException e)
        {
            
        }
		
    }
    
}