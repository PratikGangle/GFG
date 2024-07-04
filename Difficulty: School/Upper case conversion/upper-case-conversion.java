//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String transform(String s)
    {
        char[] ch = new char[s.length()];
        if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){
            ch[0] = (char) (s.charAt(0)-32);
        }
        else{
            ch[0] = s.charAt(0);
        }
        
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            if(s.charAt(i-1) ==' '  && c >='a' && c <= 'z'){
                ch[i] = (char) (c-32);
            }
            else{
                ch[i] = c;
            }
        }
         return new String(ch);
    }
}