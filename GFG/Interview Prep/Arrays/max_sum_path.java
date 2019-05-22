// Q : https://practice.geeksforgeeks.org/problems/max-sum-path-in-two-arrays/1/?track=interview-arrays
// Editorial : https://www.geeksforgeeks.org/maximum-sum-path-across-two-arrays/
class GfG
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    int maxPathSum(int ar1[], int ar2[])
    {
        
        int s1 = ar1.length;
        int s2 = ar2.length;
        
        int i=0,j=0,res=0,sum1=0,sum2=0;
        
        while(i<s1 && j<s2)
        {
            if(ar1[i]<ar2[j])
            {
                sum1 = sum1+ar1[i];
                i++;
            }
            else if(ar1[i]>ar2[j])
            {
                sum2 = sum2 + ar2[j];
                j++;
            }
            else
            {
                res = res + Math.max(sum1,sum2);
                sum1=0;
                sum2=0;
                while(i<s1 && j<s2 && ar1[i]==ar2[j])
                {
                    res = res + ar1[i];
                    i++;
                    j++;
                }
            }
        }
        while(i<s1)
        {
            sum1 = sum1 + ar1[i];
            i++;
        }
        while(j<s2)
        {
            sum2 = sum2 + ar2[j];
            j++;
        }
        return res + Math.max(sum1,sum2);
        //return (currsum1>=currsum2)?currsum1:currsum2;
    }
}