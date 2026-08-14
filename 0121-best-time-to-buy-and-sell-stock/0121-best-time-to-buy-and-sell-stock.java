class Solution {
    public int maxProfit(int[] prices) {
         
        int profit=0;
        int bestbuy=prices[0];
        for(int i=1; i<prices.length; i++){
            int currprices=prices[i];
            if(currprices>bestbuy){
                profit=Math.max(profit,currprices-bestbuy);
            }
            bestbuy=Math.min(currprices,bestbuy);
        }return profit;
    }
}