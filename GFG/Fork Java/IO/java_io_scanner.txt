/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Geeks{
    
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		   int a = sc.nextInt();
		   System.out.println(a);
		   float b = sc.nextFloat();
		   System.out.println(b);
		   long c = sc.nextLong();
		   System.out.println(c);
		   byte d = sc.nextByte();
		   System.out.println(d);
		   sc.nextLine();
		   String s = sc.nextLine();
		   System.out.println(s);
		   
		}
		
    }
    