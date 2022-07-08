class Solution {
    public boolean isPowerOfFour(int n) {
        long m = 1;
        while(n > m)
        {
            m *= 4;

        }
        return n==m;
    }
}