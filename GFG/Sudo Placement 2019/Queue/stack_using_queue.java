// Q : https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1/?track=sp-queue&batchId=152

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    if(q1.size()==0)
	    {
	        return -1;
	    }
	    //Iterator<Integer> itr = q1.iterator();
	    int elem = -1;
	    while(q1.size()!=1)
	    {
	        elem = (int)q1.poll();
	        q2.add(elem);
	        
	    }
	    elem = q1.poll();
	    Queue<Integer> temp = q1;
	    q1 = q2;
	    q2 = temp;
	    return elem;
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    q1.add(a);
    }
}
