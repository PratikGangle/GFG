//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int n = str.length() ,p1,p2;
        int ans=0;
        for(int i=0; i<n; i++){
            if(i<n-1){
                p1 = calculate(str.charAt(i));
                p2 = calculate(str.charAt(i+1));
                if(p1<p2){
                    ans = ans-p1;
                }
                else{
                    ans = ans+p1;
                }
            }
            else{
                ans = ans + calculate(str.charAt(i));
            }
        }
        
        return ans;
    }
    
     public static int calculate(char a){
         if(a=='I')
            return 1;
         else if(a=='V')
            return 5;
         else if(a=='X')
            return 10;
         else if(a=='L')
            return 50;
         else if(a=='C')
            return 100;
         else if(a=='D')
            return 500;
         else if(a=='M')
            return 1000;
         else return 0;
     }
}