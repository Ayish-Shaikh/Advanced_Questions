package LeetCode;

public class Question121BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        Problem4 prob = new Problem4();
        int a = prob.maxProfit(nums);
        System.out.println(a);// buy price = 1 current price = 6 - 1 = 5 and 5 is the profit
    }
}
class Problem4 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max_profit = 0;
        int buy_prices = prices[0];
        for(int i = 0; i< n; i++){
            int current_profit = prices[i] - buy_prices;
            if(current_profit > max_profit){
                max_profit = current_profit;
            }
            if(prices[i] < buy_prices){
                buy_prices = prices[i];
            }
        }
        return max_profit;
    }
}