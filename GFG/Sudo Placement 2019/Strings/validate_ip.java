// Q : https://practice.geeksforgeeks.org/problems/validate-an-ip-address/1/?track=sp-strings&batchId=152

class Solution
{
	public boolean isValidIP(String s)
	{
	    
        int l = s.length();
        if(l>15 || l<7 || !Character.isDigit(s.charAt(0)) || !Character.isDigit(s.charAt(l-1)))
        {
            return false;
        }
        
        String[] nums = s.split("\\.");
        if(nums.length<3 || nums.length>4)
        {
            return false;
        }
        
        for(String num : nums)
        {
            if(num.matches("[a-zA-z]+"))
            {
                return false;
            }
            int x = Integer.parseInt(num);
            int le = num.length();
            if( (x<100 && le>2) || (x<10 && le>1) || (x>255) || (x<=255 && le>3) )
            {
                return false;
            }
        }
        return true;
        
	}
}