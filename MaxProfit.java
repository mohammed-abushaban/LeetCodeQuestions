public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int result = 0;
        int current = prices[0];
        for (int i = 1; i < prices.length; i++) {
            result = Math.max(result, prices[i] - current);
            current = Math.min(current, prices[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] { 1, 2, 5, 1, 7, 6 }));
    }
}
