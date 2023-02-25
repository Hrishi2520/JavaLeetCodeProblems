public class SellStock2 {
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }

        int minStockPrice = Integer.MAX_VALUE;
        int maxDiff = 0;

        for(int i = 0; i < prices.length; i++) {
            int earn = prices[i] - minStockPrice;
            maxDiff = Math.max(earn, maxDiff); 
            minStockPrice = Math.min(minStockPrice, prices[i]);
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        int[] prices = [7,1,5,3,6,4];
        int profit = maxProfit(prices);
        System.out.println(profit);
    }
}