class Stocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Stocks obj = new Stocks();
        int maxProfit = obj.maxProfit(prices);
        System.out.println(maxProfit);
    }
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
