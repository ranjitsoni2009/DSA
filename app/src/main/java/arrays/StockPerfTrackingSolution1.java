package arrays;

/**
 * Approach :- Brute Force Solution
 * Problem Statement :- Write a function to track the performance of the stock for various interval.
 * <p>
 * Example :- let's say stock prices are [-7, 1, 5, 3, -3, 4] for Day-0 to Day-5 and need to know if there is profit/loss in any given interval.
 *            Days Interval : [2, 4] => Profit of 5
 */
public class StockPerfTrackingSolution1 {

    /**
     * This method is used to track the performance of the stock for various interval.
     * <p>
     * Logic Explanation:
     *    1. Iterate over the intervals array.
     *    2. For each interval, calculate the profit/loss by adding the stock prices for the given interval.
     *    3. Store the profit/loss in the result array.
     *    4. Return the result array.
     * <p>
     * Time Complexity:
     *      The time complexity is O(N*M) where N is the length of the stockPrices array and M is the length of the intervals array.
     *    Let's say N is the length of the stockPrices array and M is the length of the intervals array.
     *    Outer loop will execute M times and inner loop will execute N times.
     *    So, the time complexity is O(N*M).
     * <p>
     * Space Complexity:
     *    The space complexity is O(M) where M is the length of the intervals array.
     *    The space complexity is O(1) if we don't consider the space required for the output array.
     *
     * @param stockPrices The array of stock prices for each day.
     * @param intervals The array of intervals for which the performance needs to be tracked.
     * @return The array of profits/losses for each interval.
     */
    public int[] trackStockPerformance(int[] stockPrices, int[][] intervals) {
        int[] profitOrLoss = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            profitOrLoss[i] = calculateProfitOrLoss(stockPrices, intervals[i][0], intervals[i][1]);
        }
        return profitOrLoss;
    }

    /**
     * This method is used to calculate the profit/loss for the given interval.
     *
     * @param stockPrices The array of stock prices for each day.
     * @param start The start day of the interval.
     * @param end The end day of the interval.
     * @return The profit/loss for the given interval.
     */
    private int calculateProfitOrLoss(int[] stockPrices, int start, int end) {
        int profitOrLoss = 0;
        for (int i = start; i <= end; i++) {
            profitOrLoss += stockPrices[i];
        }
        return profitOrLoss;
    }
}
