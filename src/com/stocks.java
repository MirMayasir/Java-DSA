package com;

public class stocks {
    // Optimal approach -> o(n)
    public static int buySell(int price[])
    {
       int minPrice = Integer.MAX_VALUE;
       int maxProfit = 0;
       for(int i =0; i<price.length; i++)
       {
           if(price[i] < minPrice)
           {
               minPrice = price[i];
           }
           else if(price[i] - minPrice > maxProfit)
           {
               maxProfit = price[i] - minPrice;
           }

       }
       return maxProfit;
    }
    // Normal Approach -> o(n^2)
    public static int buySell2(int price[])
    {
        int ans = 0;
        int profit = 0;
        for (int i = 0; i < price.length - 1; i++) {
            for (int j = i + 1; j < price.length; j++) {
                ans = price[j] - price[i];
                profit = Math.max(ans, profit);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
       // System.out.println(buySell());

    }
}
