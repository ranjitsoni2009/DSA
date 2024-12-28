package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StockPerfTrackingSolution2Test {

    @Test
    void testTrackStockPerformance_singleInterval() {
        StockPerfTrackingSolution2 stockPerfTracking = new StockPerfTrackingSolution2();
        int[] stockPrices = {-7, 1, 5, 3, -3, 4};
        int[][] intervals = {{2, 4}};
        int[] expected = {5};
        assertArrayEquals(expected, stockPerfTracking.trackStockPerformance(stockPrices, intervals));
    }

    @Test
    void testTrackStockPerformance_multipleIntervals() {
        StockPerfTrackingSolution2 stockPerfTracking = new StockPerfTrackingSolution2();
        int[] stockPrices = {-7, 1, 5, 3, -3, 4};
        int[][] intervals = {{0, 1}, {1, 3}, {2, 5}};
        int[] expected = {-6, 9, 9};
        assertArrayEquals(expected, stockPerfTracking.trackStockPerformance(stockPrices, intervals));
    }

    @Test
    void testTrackStockPerformance_emptyIntervals() {
        StockPerfTrackingSolution2 stockPerfTracking = new StockPerfTrackingSolution2();
        int[] stockPrices = {-7, 1, 5, 3, -3, 4};
        int[][] intervals = {};
        int[] expected = {};
        assertArrayEquals(expected, stockPerfTracking.trackStockPerformance(stockPrices, intervals));
    }

    @Test
    void testTrackStockPerformance_singleDayInterval() {
        StockPerfTrackingSolution2 stockPerfTracking = new StockPerfTrackingSolution2();
        int[] stockPrices = {-7, 1, 5, 3, -3, 4};
        int[][] intervals = {{3, 3}};
        int[] expected = {3};
        assertArrayEquals(expected, stockPerfTracking.trackStockPerformance(stockPrices, intervals));
    }

    @Test
    void testTrackStockPerformance_largeArray() {
        StockPerfTrackingSolution2 stockPerfTracking = new StockPerfTrackingSolution2();
        int size = 1000;
        int[] stockPrices = new int[size];
        for (int i = 0; i < size; i++) {
            stockPrices[i] = i + 1;
        }
        int[][] intervals = {{0, 999}};
        int[] expected = {500500}; // Sum of first 1000 natural numbers
        assertArrayEquals(expected, stockPerfTracking.trackStockPerformance(stockPrices, intervals));
    }

    @Test
    void testTrackStockPerformance_invalidInterval() {
        StockPerfTrackingSolution2 stockPerfTracking = new StockPerfTrackingSolution2();
        int[] stockPrices = {-7, 1, 5, 3, -3, 4};
        int[][] intervals = {{-1, 2}, {2, 6}, {4, 3}};
        assertThrows(IllegalArgumentException.class, () -> stockPerfTracking.trackStockPerformance(stockPrices, intervals));
    }
}