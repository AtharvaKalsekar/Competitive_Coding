// Q : https://practice.geeksforgeeks.org/problems/linked-list-in-zig-zag-fashion/1/?track=sp-linked-list

class GfG
{
	public static void zigzag(Node phead)
	{
	    Node temp = phead;
	    int i=0;
	    
	    while(temp.next!=null)
	    {
	        if(i%2==0)
	        {
	            //System.out.println(temp.data+" "+temp.next.data);
	            if(temp.data>temp.next.data)
	            {
	                swap(temp,temp.next);
	            }
	        }
	        else
	        {
	            //System.out.println(temp.data+" "+temp.next.data);
	            if(temp.data<temp.next.data)
	            {
	                swap(temp,temp.next);
	            }
	        }
	        temp = temp.next;
	        i++;
	    }
	    Node t = phead;
	    StringBuffer sb = new StringBuffer();
	    while(t!=null)
	    {
	        sb.append(t.data+" ");
	        t = t.next;
	    }
	    System.out.println(sb);
	}
	
	static void swap(Node a, Node b)
	{
	    int d = a.data;
	    a.data = b.data;
	    b.data = d;
	}
}