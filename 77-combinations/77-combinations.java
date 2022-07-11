class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList();
        combination(1,n, new ArrayList(), res,k);
            return res;
    }
    void combination(int index , int n , List<Integer> curr, List<List<Integer>> res , int k)
    {
      if(curr.size() == k){
        res.add(new ArrayList(curr));
          return;
      }
    for(int i = index ;i<=n;i++)
    {
        curr.add(i);
        combination( i+1 , n, curr , res ,k);
            curr.remove(curr.size()-1);
    }
    }
}