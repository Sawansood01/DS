// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int r = 0, sum = 0;
        String s="";
        int p = n;
        while( n != 0)
        {
            r  = n%10;
            sum += r*r*r;
            n = n/10;
        }
        if(sum == p)
       s= "Yes";
        else
      s= "No";
      return s;
    }
}