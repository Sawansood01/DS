class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
            int curr =0 , sum = Integer.MIN_VALUE;
            for(int i = 0 ; i< n; i++)
            {
                    curr = curr + nums[i];
                    if(curr > sum)
                        sum = curr;
                if(curr < 0)
                    curr =0;
                
            }
        return sum;
    }
}