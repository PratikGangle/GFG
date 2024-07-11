//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        int[] freqA = new int[26];
        int[] freqB = new int[26];
        
        for (char c : A.toCharArray()) {
            freqA[c - 'a']++;
        }
        
        for (char c : B.toCharArray()) {
            freqB[c - 'a']++;
        }
        
        List<Character> uncommonChars = new ArrayList<>();
        
        for (int i = 0; i < 26; i++) {
            if ((freqA[i] > 0 && freqB[i] == 0) || (freqA[i] == 0 && freqB[i] > 0)) {
                uncommonChars.add((char) (i + 'a'));
            }
        }
        
        if (uncommonChars.isEmpty()) {
            return "-1";
        }
        
        Collections.sort(uncommonChars);
        
        StringBuilder result = new StringBuilder();
        
        for (char c : uncommonChars) {
            result.append(c);
        }
        
        return result.toString();
    }
}