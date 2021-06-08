package best.time.to.buy.and.sell.stock.with.cooldown;

import java.util.HashMap;

public class Solution {

    private static final int CAN_BUY = 0;
    private static final int CAN_SELL = 1;

    private final HashMap<Integer, Integer> buyProfits = new HashMap<>();
    private final HashMap<Integer, Integer> sellProfits = new HashMap<>();

    public int maxProfit(int[] prices) {
        return maxProfit(CAN_BUY, 0, 0, prices);
    }

    private int maxProfit(int state, int payload, int index, int[] prices) {
        if (index >= prices.length) return 0;

        switch (state) {
            case CAN_BUY: {
                if (buyProfits.containsKey(index)) {
                    return buyProfits.get(index);
                }
                int profit =
                        Math.max(
                                maxProfit(CAN_SELL, prices[index], index + 1, prices),
                                maxProfit(CAN_BUY, 0, index + 1, prices)
                        );
                buyProfits.put(index, profit);
                return profit;
            }
            case CAN_SELL: {
//                if(sellProfits.containsKey(index)) {
//                    return sellProfits.get(index);
//                }
                int profit = Math.max(
                        (prices[index] - payload + maxProfit(CAN_BUY, 0, index + 2, prices)),
                        maxProfit(CAN_SELL, payload, index + 1, prices)
                );
                sellProfits.put(index, profit);
                return profit;
            }
            default:
                throw new IllegalStateException("Unknown state");
        }
    }
}
