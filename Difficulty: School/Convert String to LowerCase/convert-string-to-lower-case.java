//{ Driver Code Starts
// Initial template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.toLower(s));
        }
    }
}
// } Driver Code Ends


// User function template for Java

class Solution {
    static String toLower(String s) {
       
        // create a new charecter array
        char[]  ch = new char[s.length()];
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            // ASCII value of A is 65 and a is 97
            // diff is 32 
            if( c>= 'A' && c<='Z'){
                ch[i] = (char) (c+ 32);
            }
            else{
                ch[i] = c;
            }
        }
        return new String(ch);
    }
}