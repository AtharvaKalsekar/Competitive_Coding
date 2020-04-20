// https://practice.geeksforgeeks.org/problems/preorder-traversal/1/

class BinaryTree
{
    /* Computes the number of nodes in a tree. */
    static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

}