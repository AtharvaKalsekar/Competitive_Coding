// Q : https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1/?track=sp-arrays-and-searching

class GfG
{
    void countDistinct(int A[], int k, int n)
    {
	    HashSet<Integer> hs = new HashSet<Integer>();
	    StringBuffer sb = new StringBuffer();
	    
	    int count = 0;
	    for(int i=0; i<n; i++)
	    {
	        int c=i;
	        for(; c<i+k; c++)
	        {
	            if(c>=n)
	            {
	                break;
	            }
	            if(!hs.contains(A[c]))
	            {
	                hs.add(A[c]);
	                count++;
	            }
	            
	        }
	        
	        
	           if(c<n)
	           {
	            sb.append(count+" ");
	            count=0;
	            hs.clear();
	           }
	           
	           if(c==n)
	           {
	               sb.append(count+" ");
	               break;
	           }
	        
	    }
	    System.out.print(sb);
    }
}
