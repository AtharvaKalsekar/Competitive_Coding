// https://practice.geeksforgeeks.org/problems/level-order-traversal/1

class Level_order_traversal
{
    //You are required to complete this method
    static void levelOrder(Node node) 
    {
        LinkedList<Node> q = new LinkedList<Node>();
        q.add(node);
        StringBuilder sb = new StringBuilder();
        
        while(!q.isEmpty())
        {
            Node curr = q.poll();
            sb.append(curr.data+" ");
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }
        System.out.print(sb);
    }
}
