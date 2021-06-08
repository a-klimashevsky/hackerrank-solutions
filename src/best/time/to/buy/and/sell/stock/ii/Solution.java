package best.time.to.buy.and.sell.stock.ii;

/**
 * Created by alexk on 2/19/21.
 */
public class Solution {
    public int maxProfit(int[] prices) {

        int buyPrice = Integer.MIN_VALUE;

        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (buyPrice == Integer.MIN_VALUE) {
                if (prices[i + 1] > prices[i]) {
                    buyPrice = prices[i];
                }
            } else {
                if (prices[i + 1] < prices[i]) {
                    profit += prices[i] - buyPrice;
                    buyPrice = Integer.MIN_VALUE;
                }
            }

        }

        if (buyPrice != Integer.MIN_VALUE) {
            profit += prices[prices.length - 1] - buyPrice;
        }

        return profit;
    }
}
