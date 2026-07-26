class Solution {
    public int maxProfit(int[] prices) {
        int best_Buy=prices[0];
        int max_profit=0;
        int i=1;
        int n= prices.length;

        while(i<n){
            if(prices[i]>best_Buy){
                max_profit=Math.max(max_profit,(prices[i]-best_Buy));
            }
            best_Buy=Math.min(best_Buy,prices[i]);
            i++;
        }
        return max_profit;
    }
}