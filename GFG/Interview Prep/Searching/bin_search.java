// Q : https://practice.geeksforgeeks.org/problems/binary-search/1/?track=searching-interview&batchId=117

class GfG
{
	int bin_search(int a[], int left, int right,  int key)
	{
		int mid = ( left + right )/2;
		while(mid>left && mid<right)
		{
		   // System.out.println(mid);
		    if(a[mid]==key)
		    {
		       // System.out.println("0");
		        return mid;
		    }
		    else if(a[mid]<key)
		    {
		        //System.out.println("1");
		        left = mid;
		    }
		    else
		    {
		       // System.out.println("2");
		        right = mid;
		    }
		    mid = (int)Math.ceil((float)(left+right)/2);
		}
		//System.out.println("out : "+mid);
		//System.out.println((int)Math.ceil((float)(left+right)/2));
		if(a[mid]==key)
		{
		    return mid;
		}
		return -1;
		
	}
}
