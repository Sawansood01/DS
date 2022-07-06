class Solution {
    public boolean isPowerOfThree(int n) {
        long num =1;
        while(n>num)
        {
            num *= 3;
        }
        return n==num;
    }
}