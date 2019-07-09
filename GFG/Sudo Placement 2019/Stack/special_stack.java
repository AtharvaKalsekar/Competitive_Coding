// Q : https://practice.geeksforgeeks.org/problems/special-stack/1/?track=sp-stack

class GfG
{
    private int mini;
	public void push(int a,Stack<Integer> s)
	{
	    //System.out.println(a);
	    if(s.empty())
	    {
	        //System.out.println(a);
	        
	        this.mini = a;
	        s.push(a);
	    }
	    else if(a<this.mini)
        {
           // System.out.println(a);
            s.push(2*a-this.mini);
            this.mini = a;
        }
        else
        {
          //  System.out.println(a);
            s.push(a);
	    }
	    
	}
	public int pop(Stack<Integer> s)
    {
        if(s.empty())
        {
            return -1;
        }
        else if(s.peek()<this.mini)
        {
            int elem = this.mini;
            this.mini = 2*s.pop()-this.mini;
            return elem;
        }
        return s.pop();
	}
	public int min(Stack<Integer> s)
    {
        return this.mini;       
	}
	public boolean isFull(Stack<Integer>s, int n)
    {
        //System.out.println("hello");
        if(s.size()<n)
        {
            return false;
        }
        return true;
	}
	public boolean isEmpty(Stack<Integer>s)
    {
        return s.empty();
	}
}