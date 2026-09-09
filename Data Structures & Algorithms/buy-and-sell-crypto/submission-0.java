class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int maxProfit=0;
        while(right<=prices.length-1){
            if(prices[right]>prices[left]){
                int currentProfit=prices[right]-prices[left];
                maxProfit=Math.max(maxProfit, currentProfit);
                right++;
            }else{
                left=right;
                right++;
            }
        }
        return maxProfit;
    }
}
