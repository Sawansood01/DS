class Solution {
    public int firstMissingPositive(int[] A) {
       Arrays.sort(A);
        int n = 1;
        for(int i =0; i<= A.length-1 ;i++)
        {
            if(A[i] == n)
                n++;      
        }
        return n;
    }
}