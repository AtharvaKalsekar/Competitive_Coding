class GfG
{
	int minEle;
	Stack<Integer> s;
	
	GfG()
	{
		this.s = new Stack<Integer>();
	}
	
	int getMin()
	{
		if(s.empty())
		{
			return -1;
		}
		return this.minEle;
	}

	int pop()
	{
		if(s.empty())
		{
			return -1;
		}
		int e=-1;
		if(s.peek()<minEle)
		{
			e = minEle;
			minEle = 2*minEle - s.peek();
			s.pop();
		}
		else
		{
			e = s.pop();
		}
		return e;
	}
	
	void push(int x)
	{
		if(s.empty())
		{
			minEle = x;
			s.push(x);
			return;
		}

		if(x<minEle)
		{
			s.push(2*x-minEle);
			minEle = x;
		}
		else
		{
			s.push(x);
		}
	}
}