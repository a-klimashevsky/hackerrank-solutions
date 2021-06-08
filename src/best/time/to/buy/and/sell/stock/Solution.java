package best.time.to.buy.and.sell.stock;

/**
 * Created by alexk on 2/19/21.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int max = prices[prices.length - 1];
        int maxProfit = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            int profitNow = max - prices[i];
            maxProfit = Math.max(profitNow, maxProfit);
            max = Math.max(prices[i], max);
        }
        return maxProfit;
    }
}
