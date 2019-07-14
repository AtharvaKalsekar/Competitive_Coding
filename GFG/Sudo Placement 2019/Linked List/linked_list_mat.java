// Q : https://practice.geeksforgeeks.org/problems/linked-list-matrix/1/?track=sp-linked-list

class GFG
{
    static Node construct(int a[][],int n)
    {
        Node mainHead = null;
        Node prevHead = null;
        //Node prevHeadTemp;
        
        for(int i=0; i<n; i++)
        {
            Node head = new Node();
            head.data = a[i][0];
            Node col = head;
            for(int j=1; j<n; j++)
            {
                col.right = new Node();
                col.right.data = a[i][j];
                
                if(i>0)
                {
                    prevHead.down = col;
                    prevHead = prevHead.right;
                }
                else
                {
                    mainHead = head;
                }
                col = col.right;
            }
            col.right = null;
            prevHead = head;
        }
        while(prevHead!=null)
        {
            prevHead.down = null;
            prevHead = prevHead.right;
        }
        return mainHead;
    }
}