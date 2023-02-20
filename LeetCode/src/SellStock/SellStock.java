public class SellStock {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            pist = prices[i] - min;
            if(profit < pist){
                profit = pist;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = [7,1,5,3,6,4];
        int profit = maxProfit(prices);
        System.out.println(profit);
    }
}