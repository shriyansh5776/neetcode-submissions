class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 ;
        int max = 0 ;
        int n = prices.length;
        for(int i = 0 ;i<n;i++){
            profit = 0 ;
            for(int j = i+1;j<n;j++){
                if(prices[i]<prices[j]){
                    profit = prices[j]-prices[i];
                }
            max = Math.max(profit,max);
            }
        }
        return max ;
    }
}
