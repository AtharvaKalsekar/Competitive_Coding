class GfG{
    
    void insert(Stack<Integer> s, int a)
    {
        if(s.empty() || s.peek()<=a)
        {
            s.push(a);
        }
        else
        {
            int x = s.peek();
            s.pop();
            
            insert(s,a);
            
            insert(s,x);
            
        }
    }
    
    void emptyStack(Stack<Integer> s)
    {
        if(!s.empty())
        {
            int a = s.peek();
            s.pop();
            emptyStack(s);
            
            insert(s,a);
        }
        
    }
    
	public Stack<Integer> sort(Stack<Integer> s)
	{
	    emptyStack(s);
		return s;
	}
}