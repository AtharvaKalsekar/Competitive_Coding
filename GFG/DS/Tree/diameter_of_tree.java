// https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1
// TLE

class Tree {
    /* Complete the function to get diameter of a binary tree */
    
    int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int l = height(root.left);
        int r = height(root.right);
        
        return (int)Math.max(l,r)+1;
    }
    
    int diameter(Node root) 
    {
        if(root == null)
        {
            return 0;
        }
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        
        return Math.max(lh+rh+1,Math.max(ld,rd));
    }
}