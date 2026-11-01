class Solution {
    public int maxProfit(int[] prices) {
        int curr = 0 ;
        int profit = 0 ;
        int n = prices.length;
        for(int i = 0 ;i<n;i++){
            for(int j = i+1 ;j<n;j++){
                curr = prices[i];
                if(curr<prices[j]){
                    profit=profit+prices[j]-curr;
                }
                break  ;
            }
        }
        return profit ;
    }
}