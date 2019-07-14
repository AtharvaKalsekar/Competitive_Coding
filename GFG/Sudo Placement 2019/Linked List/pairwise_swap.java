// Q : https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1/?track=sp-linked-list&batchId=152

class GfG
{
    public static void pairwiseSwap(Node node)
    {
        Node cur = node;
        Node nex = node.next;
        
        while(cur!=null && nex!=null)
        {
            int d = cur.data;
            cur.data = nex.data;
            nex.data = d;
            if(cur.next!=null && nex.next!=null)
            {
                cur = cur.next.next;
                nex = nex.next.next;
            }
            else
            {
                break;
            }
        }
        
        
    }
    
   
}