// https://practice.geeksforgeeks.org/problems/ancestors-in-binary-tree/1
class GfG
{
    
    public static boolean printAncestors(Node node, int x)
    {
        if(node==null)
        {
            return false;
        }
        
        if(node.data==x)
        {
            return true;
        }
        
        if(printAncestors(node.left,x) || printAncestors(node.right,x))
        {
            System.out.print(node.data+" ");
            return true;
        }
        
        return false;
    }
}