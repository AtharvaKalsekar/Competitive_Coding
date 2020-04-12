class GfG
{
    int tour(int petrol[], int distance[])
    {
	    int cal=0;
	    int deficit = 0;
	    int n = petrol.length;
	    int start=0;
	    
	    for(int i=0; i<n; i++)
	    {
	        cal+=petrol[i]-distance[i];
	        if(cal<0)
	        {
	            start = i+1;
	            deficit+=cal;
	            cal=0;
	        }
	    }
	    
	    return (cal+deficit)>0? start:-1;
    }
}