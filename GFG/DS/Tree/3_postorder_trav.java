// practice.geeksforgeeks.org/problems/postorder-traversal/1/
class Tree
{
    void postOrder(Node root)
    {
       if(root==null)
       {
           return;
       }
       postOrder(root.left);
       postOrder(root.right);
       System.out.print(root.data + " ");
    }
}