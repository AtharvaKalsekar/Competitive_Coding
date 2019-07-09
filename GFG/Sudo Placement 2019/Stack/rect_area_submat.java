// Q : https://practice.geeksforgeeks.org/problems/max-rectangle/1/?track=sp-stack&batchId=152

class GfG
{
    public int maxArea(int a[][],int m,int n)
    {
        int max = Math.max(0,getArea(a[0],n));
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==1)
                {
                    a[i][j] += a[i-1][j];
                }
            }
            max = Math.max(max,getArea(a[i],n));
        }
        return max;
    }
    
    int getArea(int[] hist,int n)
    {
        Stack<Integer> stk = new Stack<Integer>();
        int i=0;
        int max = 0;
        while(i<n)
        {
            if(stk.empty() || hist[stk.peek()]<=hist[i])
            {
                stk.push(i++);
            }
            else
            {
                int index = stk.pop();
                int curr_ar = hist[index]*((stk.empty())?i:(i-stk.peek()-1));
                max = Math.max(max,curr_ar);
            }
        }
        while(!stk.empty())
        {
            int index = stk.pop();
            int curr_ar = hist[index]*((stk.empty())?i:(i-stk.peek()-1));
            max = Math.max(max,curr_ar);
        }
        return max;
    }
    
}