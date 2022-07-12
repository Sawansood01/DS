class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList();
        combination(1, 9 , new ArrayList() , res, k , n);
        return res;
    }
    void combination(int start , int end ,List<Integer> curr , List<List<Integer>> res , int k , int target )
    {
        if(target == 0 && curr.size() == k)
        res.add(new ArrayList(curr));
        for(int i = start ;i<=end ;i++)
        {
            curr.add(i);
         combination(i+1, end , curr , res, k , target-i);
            curr.remove(curr.size()-1);
            }
    }
}