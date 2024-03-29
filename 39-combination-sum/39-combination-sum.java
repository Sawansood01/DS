class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> comb = new ArrayList();
        generatecombination(0 , candidates, new ArrayList() , comb , target);
    return comb;
    }
    void generatecombination(int start , int[] nums , List<Integer> curr , List<List<Integer>> comb , int target )
    {
        if(target == 0)
        {
        comb.add(new ArrayList(curr));
        }
        if(target < 0)
            return;
        for(int i = start ; i<nums.length;i++)
        {
            curr.add(nums[i]);
             generatecombination(i , nums, curr , comb , target-nums[i]);
            curr.remove(curr.size()-1);
        }
    }
}