class Solution {
    public int maxProfit(int[] prices) {
        int max=-1;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i;j<prices.length;j++){
                max=Math.max(prices[j]-prices[i],max);
            }
        }
        return max<0?0:max;
    }
}
