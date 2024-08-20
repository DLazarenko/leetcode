class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int result = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
                max = prices[i];
            }
            if(prices[i] > max)
                max = prices[i];       
            result = Math.max(result, max - min);
        }
        return result;
    }
}