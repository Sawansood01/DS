class Solution {
    public boolean isPowerOfTwo(int n) {
       long m = 1;
        while(n > m)
        {
            m *= 2;
        }
        return n==m;
        }
}

