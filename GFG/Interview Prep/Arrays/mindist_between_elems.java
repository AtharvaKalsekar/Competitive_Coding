//Q : https://practice.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1/?track=interview-arrays&batchId=117
//Editorial : https://www.geeksforgeeks.org/find-the-minimum-distance-between-two-numbers/
class Element
{
    boolean present;
    ArrayList<Integer> locations;
    
    Element()
    {
        this.present = false;
        locations = new ArrayList<Integer>();
    }
}
class GfG
{
    long minDist(Long arr[], long n, long x, long y) 
    {
        Element x1 = new Element();
        Element y1 = new Element();
        for(int i=0; i<n; i++)
        {
           if(arr[i]==x)
           {
               x1.present = true;
               x1.locations.add(i);
           }
           else if(arr[i]==y)
           {
               y1.present = true;
               y1.locations.add(i);
           }
        }
        
        if(!x1.present || !y1.present)
        {
            return -1;
        }
        
        int size1=x1.locations.size();
        int size2=y1.locations.size();
        long diff = Long.MAX_VALUE;
        for(int k=0; k<size1; k++)
        {
            int elem1 = x1.locations.get(k);
            for(int l=0; l<size2; l++)
            {
                int elem2 = y1.locations.get(l);
                int currDiff=Math.abs(elem1-elem2);
                if(currDiff<diff)
                {
                    diff = currDiff;
                }
            }
        }
        return diff;
    }
}