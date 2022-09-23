class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int r =0;
        int n = nums.length;
        int c = 0;
        for(int i =0;i<n-1;i+=2)
        {
            if(nums[i] != nums[i+1])
                return nums[i];   //if any pairwise values are different, then it is answer
        }
        return nums[n-1];    //if answer is largest value, then it will not be detected in above loop hence return it here
    }
}