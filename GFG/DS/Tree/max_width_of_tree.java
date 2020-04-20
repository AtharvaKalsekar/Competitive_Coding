// https://practice.geeksforgeeks.org/problems/maximum-width-of-tree/1
class Tree
{
    int getMaxWidth(Node root)
    {
        LinkedList<Node> q = new LinkedList<Node>();
        q.add(root);
        int max = 1;
        Node marker = new Node(-1);
        q.add(marker);
        while(!q.isEmpty())
        {
            Node curr = q.poll();
            
            if(curr.data==-1)
            {
                max = Math.max(max,q.size());
                if(q.size()>0)
                {
                    q.add(marker);
                }
            }
            
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }
        
        return max;
    }		
}