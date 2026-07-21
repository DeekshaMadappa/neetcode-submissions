class Solution {
    public int maxProfit(int[] prices) {

int minbuy=prices[0];
int profit=0;
for(int sell:prices){
    profit =Math.max(profit, sell-minbuy);
    minbuy=Math.min(minbuy, sell);
}
   return profit;     
        
    }
}
