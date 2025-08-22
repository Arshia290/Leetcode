class Solution {
    public int maxProfit(int[] prices) {

        int buy = 0;
        int sell = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < prices[buy]){
                buy = i;
            }else{
                int profit = prices[i] - prices[buy];
                sell = Math.max(sell, profit);
            }
        }

        return sell;
        
    }
}
