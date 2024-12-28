package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StockPerfTrackingSolution1Test {

    @Test
    void testTrackStockPerformance_singleInterval() {
        StockPerfTrackingSolution1 stockPerfTracking = new StockPerfTrackingSolution1();
        int[] stockPrices = {-7, 1, 5, 3, -3, 4};
        int[][] intervals = {{2, 4}};
        int[] expected = {5};
        assertArrayEquals(expected, stockPerfTracking.trackStockPerformance(stockPrices, intervals));
    }

    @Test
    void testTrackStockPerformance_multipleIntervals() {
        StockPerfTrackingSolution1 stockPerfTracking = new StockPerfTrackingSolution1();
        int[] stockPrices = {-7, 1, 5, 3, -3, 4};
        int[][] intervals = {{0, 1}, {1, 3}, {2, 5}};
        int[] expected = {-6, 9, 9};
        assertArrayEquals(expected, stockPerfTracking.trackStockPerformance(stockPrices, intervals));
    }

    @Test
    void testTrackStockPerformance_emptyIntervals() {
        StockPerfTrackingSolution1 stockPerfTracking = new StockPerfTrackingSolution1();
        int[] stockPrices = {-7, 1, 5, 3, -3, 4};
        int[][] intervals = {};
        int[] expected = {};
        assertArrayEquals(expected, stockPerfTracking.trackStockPerformance(stockPrices, intervals));
    }

    @Test
    void testTrackStockPerformance_singleDayInterval() {
        StockPerfTrackingSolution1 stockPerfTracking = new StockPerfTrackingSolution1();
        int[] stockPrices = {-7, 1, 5, 3, -3, 4};
        int[][] intervals = {{3, 3}};
        int[] expected = {3};
        assertArrayEquals(expected, stockPerfTracking.trackStockPerformance(stockPrices, intervals));
    }

    @Test
    void testTrackStockPerformance_largeArray() {
        StockPerfTrackingSolution1 stockPerfTracking = new StockPerfTrackingSolution1();
        int size = 1000;
        int[] stockPrices = new int[size];
        for (int i = 0; i < size; i++) {
            stockPrices[i] = i + 1;
        }
        int[][] intervals = {{0, 999}};
        int[] expected = {500500}; // Sum of first 1000 natural numbers
        assertArrayEquals(expected, stockPerfTracking.trackStockPerformance(stockPrices, intervals));
    }
}