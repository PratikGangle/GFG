//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends

class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    
     static int arr[][];
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         arr = new int[W+1][n+1];
         
         for(int i=0; i<=W; i++){
             for(int j=0; j<=n; j++){
                 arr[i][j] = -1;
             }
         }
         return helper(W,wt,val,n);
         
    } 
    
     static int helper(int W, int wt[], int val[], int n) {
         if( W == 0 || n == 0){
             return 0;
         }
         
         if(arr[W][n] != -1){
             return arr[W][n];
         }
         
         if(wt[n-1] <= W){
             int a  = val[n-1] + helper(W - wt[n-1] , wt, val, n-1);
             int b =  helper(W, wt, val, n-1);
             arr[W][n] =Math.max(a,b);
              
         }
         else{
             arr[W][n] = helper(W, wt, val, n-1);
         }
         return arr[W][n];
     }
}



