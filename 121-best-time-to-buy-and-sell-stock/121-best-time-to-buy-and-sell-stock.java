class Solution {
    public int maxProfit(int[] prices) {
        // TIME LIMIT EXCEED
    //     int profit = 0;
    // for (int i = 0; i < prices.length; i++) {
    //     for (int j = i; j >= 0; j--) {
    //         profit = Math.max(profit, prices[i]-prices[j]);
    //     }
    // }
    // return profit;
        // ANOTHER SOLUTION
        int min = prices.length > 0 ? prices[0]:0;
        int profit =0;
        for(int i =0;i<prices.length;i++)
        {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit , prices[i]-min);
        }
        return profit;
}
}