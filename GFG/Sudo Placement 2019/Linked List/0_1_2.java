// Q : https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1/?track=sp-linked-list

class LinkedList
{
    static Node segregate(Node head)
    {
        Node t0=null;
        Node t1=null;
        Node t2=null;
        Node t0_h = null;
        Node t1_h = null;
        Node t2_h = null;
        
        Node t = head;
        
        while(t!=null)
        {
            
            switch(t.data)
            {
                case 0:
                    if(t0_h==null)
                    {
                        t0_h = t;
                        t0 = t0_h;
                    }
                    else
                    {
                        t0.next = t;
                        t0=t0.next;
                    }
                    break;
                
                case 1:
                    if(t1_h==null)
                    {
                        t1_h = t;
                        t1 = t1_h;
                    }
                    else
                    {
                        t1.next = t;
                        t1=t1.next;
                    }
                    break;
                case 2:
                    if(t2_h==null)
                    {
                        t2_h = t;
                        t2 = t2_h;
                    }
                    else
                    {
                        t2.next = t;
                        t2=t2.next;
                        
                    }
                    break;
                    
            }
            
            t = t.next;
        }
        
    
        
        if(t0!=null)
        {
            
            if(t1!=null)
            {
                t0.next = t1_h;
                
                if(t2!=null)
                {
                    t1.next = t2_h;
                    t2.next= null;
                }
                
                
            }
            else if(t2!=null)
            {
                    t0.next = t2_h;
                    t2.next= null;
                
            }
            return t0_h;
    
        }
        else if(t1!=null)
        {
            t1.next = t2_h;
            if(t2!=null)
            {
                t2.next= null;
            }
            return t1_h;
        }
        
        return t2_h;
    }
}
