// Q : https://practice.geeksforgeeks.org/problems/find-length-of-loop/1/?track=sp-linked-list&batchId=152

class Loop
{
    int countNodesinLoop(Node head)
    {
	    //HashSet<Node> hs = new HashSet<Node>();
	    HashMap<Node,Integer> hm = new HashMap<Node,Integer>();
	    Node temp1 = head;
	    //hs.add(temp1);
	    int count1 = 1;
	    hm.put(temp1,count1);
	    while(temp1.next!=null)
	    {
	        temp1 = temp1.next;
	        count1++;
	        if(hm.containsKey(temp1))
	        {
	            break;
	        }
	        else
	        {
	            hm.put(temp1,count1);
	        }
	        /*
	        if(hs.contains(temp1))
	        {
	            break; 
	        }
	        else
	        {
	            hs.add(temp1);
	        }
	        */
	    }
	    if(temp1.next==null)
	    {
	        return 0;
	    }
	    /*
	    Node temp2 = head;
	    int count2 = 1;
	    while(temp2!=temp1)
	    {
	        temp2 = temp2.next;
	        count2++;
	    }
	    */
	    return count1-(int)hm.get(temp1);
    }
}