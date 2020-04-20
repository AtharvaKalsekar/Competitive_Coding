// https://practice.geeksforgeeks.org/problems/k-distance-from-root/1

class Tree
{
     
     void printKdistance(Node root, int k)
     {
          if(root==null)
          {
              return;
          }
          if(k==0)
          {
              System.out.print(root.data+" ");
              return;
          }
          
          printKdistance(root.left,k-1);
          printKdistance(root.right,k-1);
     }
}