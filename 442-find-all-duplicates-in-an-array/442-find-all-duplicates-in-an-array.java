class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] == nums[i+1])
            {
               ar.add(nums[i]); 
            }
        }
        return ar;
    }
}
