class Solution {
    public int findNumbers(int[] nums) {
        int n =nums.length;
        int c =0;
        for(int i =0;i<n;i++)
        {
        if(nums[i] >= 10 && nums[i]<100 || nums[i] >= 1000 && nums[i]<10000 || nums[i] >= 100000)
            c++;
            }
        return c;
    }
}