//https://practice.geeksforgeeks.org/problems/almost-equal-java/1/?track=module-2-arrays-and-strings-java

class Geeks{
    
    static int coutChars(String s1, String s2)
    {
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        int diff = 0;
        
        for(int i=0; i<s1.length(); i++)
        {
            char c = s1.charAt(i);
            s1Count[c-'a']++;
        }
        
        for(int i=0; i<s2.length(); i++)
        {
            char c = s2.charAt(i);
            s2Count[c-'a']++;
        }

        for(int i=0; i<26; i++)
        {
            diff+=Math.abs(s1Count[i]-s2Count[i]);
        }
        return diff;
       // System.out.println(diff);
    }
}