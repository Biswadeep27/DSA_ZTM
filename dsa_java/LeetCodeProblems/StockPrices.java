package LeetCodeProblems;

public class StockPrices {

    public static int maxProfitOne(int[] prices){
        int max_profit = 0;
        int min_price = prices[0];
        for (int price : prices){
            if (price > min_price){
                int profit = price - min_price;
                max_profit = Math.max(max_profit, profit);
            }
            else
                min_price = price;
        }
        return max_profit;
    }

    public static void main(String args[]){
        int[] prices = {4,11,2,7,1,11};
        System.out.println("Maximum profit `maxProfitOne`: " + (maxProfitOne(prices)));
    }
}
