//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}

// } Driver Code Ends




class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        
        for(int i=0; i<s1.length(); i++){
            char c = s1.charAt(i);
            set1.add(c);
        }
         
        for(int i=0; i<s2.length(); i++){
            char c = s2.charAt(i);
            set2.add(c);
        }
        
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<s1.length(); i++){
            char c = s1.charAt(i);
            if(!set2.contains(c)){
                result.append(c);
            }
        }
             
        for(int i=0; i<s2.length(); i++){
            char c = s2.charAt(i);
            if(!set1.contains(c))
            result.append(c);
        }
        if(result.length() == 0){
            return "-1";
        }
        return result.toString();
        
    }

    
}
