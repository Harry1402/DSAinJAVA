public class A121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // sample input

        Solution sol = new Solution();
        int result = sol.maxProfit(prices);

        System.out.println("Max Profit: " + result);
    }
}

class  Solution{
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for (int x : prices) {
            if (x < buy) {
                buy = x;
            } else {
                int tempprofit = x - buy;
                if (tempprofit > profit) {
                    profit = tempprofit;
                }
            }
        }
        return profit;
    }
}
