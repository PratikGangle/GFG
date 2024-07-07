//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    char firstRep(String S)
    {
        // your code here
        
        int freq[] = new int[26];
        
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            int val = c - 'a';
            freq[val]++;
        }
        
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if(freq[c - 'a'] > 1){
                return c;
            }
        }
        return '#';
    }
}