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

    public static int maxProfitTwo(int[] prices){
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxProfit = 0;
        while (i < prices.length - 1){
            while( i < prices.length - 1 && prices[i] >= prices[i+1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i+1])
                i++;
            peak = prices[i];

            maxProfit += peak - valley;
        }

        return maxProfit;
    }

    public static void main(String args[]){
        int[] prices = {4,11,2,7,1,11};
        System.out.println("Maximum profit `maxProfitOne`: " + (maxProfitOne(prices)));
        System.out.println("Maximum profit `maxProfitTwo`: " + (maxProfitTwo(prices)));
    }
}
