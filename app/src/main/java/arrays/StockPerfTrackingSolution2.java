package arrays;

/**
 * Approach :- Prefix Solution, This is Optimized approach in terms of time complexity.
 * Problem Statement :- Write a function to track the performance of the stock for various interval.
 * <p>
 * Example :- let's say stock prices are [-7, 1, 5, 3, -3, 4] for Day-0 to Day-5 and need to know if there is profit/loss in any given interval.
 *            Days Interval : [2, 4] => Profit of 5
 */
public class StockPerfTrackingSolution2 {

    /**
     * This method is used to track the performance of the stock for various interval.
     * <p>
     * Logic Explanation:
     *    1. Calculate the prefix sum of the stockPrices array.
     *    2. Iterate over the intervals array.
     *    3. For each interval, calculate the profit/loss by subtracting the prefix sum of the start day from the prefix sum of the end day.
     *    4. Store the profit/loss in the result array.
     *    5. Return the result array.
     * <p>
     * Time Complexity:
     *      The time complexity is O(N+M) where N is the length of the stockPrices array and M is the length of the intervals array.
     *    Let's say N is the length of the stockPrices array and M is the length of the intervals array.
     *    The prefix sum calculation will take O(N) time.
     *    Outer loop will execute M times.
     *    So, the time complexity is O(N+M).
     * <p>
     * Space Complexity:
     *    The space complexity is O(N) where N is the length of the stockPrices array.
     *    The space complexity is O(1) if we don't consider the space required for the output array.
     *
     * @param stockPrices The array of stock prices for each day.
     * @param intervals The array of intervals for which the performance needs to be tracked.
     * @return The array of profits/losses for each interval.
     */
    public int[] trackStockPerformance(int[] stockPrices, int[][] intervals) {
        int[] prefixSum = calculatePrefixSum(stockPrices);
        int[] profitOrLoss = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] < 0 || intervals[i][1] < 0
                    || intervals[i][0] >= stockPrices.length || intervals[i][1] >= stockPrices.length
                    || intervals[i][0] > intervals[i][1]) {
                throw new IllegalArgumentException("Invalid interval for start day " + intervals[i][0] + " and end day " + intervals[i][1]);
            }
            if (intervals[i][0] == 0) {
                profitOrLoss[i] = prefixSum[intervals[i][1]];
            } else {
                profitOrLoss[i] = prefixSum[intervals[i][1]] - prefixSum[intervals[i][0]-1];
            }
        }
        return profitOrLoss;
    }

    /**
     * This method is used to calculate the prefix sum of the stock prices array.
     *
     * @param stockPrices The array of stock prices for each day.
     * @return The array of prefix sum of the stock prices.
     */
    private int[] calculatePrefixSum(int[] stockPrices) {
        int[] prefixSum = new int[stockPrices.length];
        prefixSum[0] = stockPrices[0];
        for (int i = 1; i < stockPrices.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + stockPrices[i];
        }
        return prefixSum;
    }
}
