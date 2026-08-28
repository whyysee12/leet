class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] new_arr = new int[n];
        for (int i = 0; i < n; i++) {
            new_arr[i] = prices[i];
            for (int j = i + 1; j < n; j++) {
                if (prices[i] >= prices[j]) {
                    new_arr[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return new_arr;

    }
}
