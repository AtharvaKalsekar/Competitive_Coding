// Q : https://practice.geeksforgeeks.org/problems/anagram-of-string/1/?track=string-interview

class GfG
{
	public int remAnagrams(String s1,String s2)
        {
            int[] s_1 = new int[26];
            int[] s_2 = new int[26];
            int l1 = s1.length();
            int l2 = s2.length();
            for(int i=0; i<l1; i++)
            {
                char c = s1.charAt(i);
                s_1[c-'a']++;
            }
            for(int i=0; i<l2; i++)
            {
                char c = s2.charAt(i);
                s_2[c-'a']++;
            }
            int diff = 0;
            for(int i=0; i<26; i++)
            {
                diff += Math.abs(s_1[i]-s_2[i]);
            }
            return diff;
        }
}