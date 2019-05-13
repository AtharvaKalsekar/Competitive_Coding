class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        /*
        String pat = "[a|e|i|o|u]";
        Pattern p1 = Pattern.complie(pat);
        Matcher m1 = p1.mathcer(s);
        while(m1.find())
        {
            v++;
        }
        */
        s=s.replaceAll("\\s+","");
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
      //          System.out.print(s.charAt(i));
                v++;
            }
        }
    //    System.out.println(v);
        c=s.length()-v;
    //    System.out.print(c);
    //    System.out.print(s.length());
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
    }
}
//Position this line where user code will be pasted.
