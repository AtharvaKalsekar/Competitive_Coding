// Q : https://practice.geeksforgeeks.org/problems/circular-tour/1/?track=sp-queue&batchId=152

class GfG
{
    int tour(int petrol[], int distance[])
    {
	    Queue<Integer> q = new LinkedList<Integer>();
	    
	    int l = petrol.length;
	    int start = 0;
	    int end = 1;
	    int curr_diff = petrol[start]-distance[start];
	    while(end!=start || curr_diff<0)
	    {
	        while(curr_diff<0 && start!=end)
	        {
	            curr_diff = curr_diff - (petrol[start]-distance[start]);
	            start = (start+1)%l;
	            if(start==0)
	            {
	                return -1;
	            }
	        }
	        if(end<l)
	        {
	            curr_diff += petrol[end]-distance[end];
	        }
	        end = (end+1)%l;
	    }
	    return start;
    }
}