package Day0001;

public class MaxProfit {
    public static void main(String[] args) {

    }
}

class Solution6 {
    public int maxProfit(int[] prices) {
        int startPrice = prices[0], profit = 0;

        for (int i = 1; i<prices.length; ++i) {
            if (prices[i] < startPrice) startPrice = prices[i];
            if (profit < ( prices[i] - startPrice)) profit = prices[i] - startPrice;
        }

        return profit;
    }
}
