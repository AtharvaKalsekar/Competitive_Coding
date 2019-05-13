class Geeks{
    
    static void follPatt(String s)
    {
        boolean flag = false;
        Stack<Character> stk = new Stack<Character>();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(!stk.empty() && c=='y')
            {
                stk.pop();
            }
            else if(stk.empty() && c=='y')
            {
                flag = true;
                break;
            }
            else
            {
                stk.push(c);
            }
        }
        if(flag || !stk.empty())
        {
            System.out.print("0");
        }
        else
        {
            System.out.print("1");
        }
        System.out.println();
    }
}