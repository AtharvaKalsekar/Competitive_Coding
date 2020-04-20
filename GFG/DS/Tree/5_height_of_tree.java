// practice.geeksforgeeks.org/problems/height-of-binary-tree/1

class Tree
{
    int height(Node node) 
    {
        if(node==null)
        {
            return 0;
        }
        
        int l = height(node.left);
        int r = height(node.right);
        
        if(l>r)
        {
            return l+1;
        }
        else
        {
            return r+1;
        }
    }   
}