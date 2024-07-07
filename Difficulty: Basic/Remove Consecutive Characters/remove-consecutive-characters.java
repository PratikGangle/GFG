//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        
        String s = S + '#';
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(s.charAt(i-1) != c){
                sb.append(s.charAt(i-1));
            }
            
            
            
        }
        
        return sb.toString();
        
    }
}