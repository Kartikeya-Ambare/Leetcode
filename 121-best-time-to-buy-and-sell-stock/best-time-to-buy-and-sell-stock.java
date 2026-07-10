class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        
        int currProff = 0;
        int currListPrice = prices[0];

        for(int i =1;i<prices.length;i++){
            if(prices[i]<currListPrice) currListPrice = prices[i];
            else{
                int proff =prices[i]- currListPrice;
                currProff = Math.max(proff,currProff);
            }  
        }
        return currProff;

    }
}