class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList();
        findAll("(",1,0,res,n);
        return res;
    }
    void findAll(String curr , int open , int close , List<String> res , int n)
    {
        if(curr.length() == 2*n)
        {
            res.add(curr);
        return ;
            }
        if(open < n)
            findAll(curr +"(",open+1,close,res,n);
         if(close < open)
            findAll(curr +")",open,close+1,res,n);
    }
}