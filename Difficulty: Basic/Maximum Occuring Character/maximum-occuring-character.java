//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        int freq[] = new int[26];
        
        for(int i=0; i<line.length(); i++){
            char c = line.charAt(i);
            int val = c - 'a';
            freq[val]++;
        }
        
        int maxFreq = Integer.MIN_VALUE;
        char ans = 'a';
        
        for(int i=0; i<26; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                ans = (char) (i+ 'a');
            }
        }
        
        return ans;
    }
    
}