//Q : https://practice.geeksforgeeks.org/problems/sorted-subsequence-of-size-3/1/?track=interview-arrays
//Editorial : https://www.geeksforgeeks.org/find-a-sorted-subsequence-of-size-3-in-linear-time/

class GfG{
	public static ArrayList find3Numbers(int[] a,int n)
	{
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int lastPositive = 0;
        int count=0;
        int[] diff = new int[n];
        diff[0]=0;
        boolean flag = false;
        for(int i=1; i<n; i++)
        {
            diff[i]=a[i]-a[i-1];
            if(diff[i]>0)
            {
                if(flag)
                {
                    if(a[i]-a[lastPositive]>0)
                    {
                        count++;
                        arr.add(a[lastPositive-1]);
                        arr.add(a[lastPositive]);
                        arr.add(a[i]);
                        return arr;
                    }
                }
                lastPositive=i;
                flag=true;
                count++;
            }
        }
        arr.clear();
        return arr;
    }
}
