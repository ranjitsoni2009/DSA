package backtracking;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxPathInMatrixTest {

    @Test
    void testGetMaxPath_NormalCase() {
        MaxPathInMatrix solver = new MaxPathInMatrix();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 1, 1)),
                new ArrayList<>(Arrays.asList(0, 1, 0)),
                new ArrayList<>(Arrays.asList(1, 1, 1))
        ));
        int result = solver.getMaxPath(matrix, 0, 0, 2, 2);
        assertEquals(5, result); // One possible max path: (0,0)->(0,1)->(0,2)->(1,1)->(2,1)->(2,2)
    }

    @Test
    void testGetMaxPath_NoPath() {
        MaxPathInMatrix solver = new MaxPathInMatrix();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 0)),
                new ArrayList<>(Arrays.asList(0, 1))
        ));
        int result = solver.getMaxPath(matrix, 0, 0, 1, 1);
        assertEquals(0, result); // No path exists
    }

    @Test
    void testGetMaxPath_SingleCell() {
        MaxPathInMatrix solver = new MaxPathInMatrix();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(List.of(
                new ArrayList<>(List.of(1))
        ));
        int result = solver.getMaxPath(matrix, 0, 0, 0, 0);
        assertEquals(1, result); // Start and end are the same
    }

    @Test
    void testGetMaxPath_EmptyMatrix() {
        MaxPathInMatrix solver = new MaxPathInMatrix();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        int result = solver.getMaxPath(matrix, 0, 0, 0, 0);
        assertEquals(0, result);
    }

    @Test
    void testGetMaxPath_AllBlocked() {
        MaxPathInMatrix solver = new MaxPathInMatrix();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(0, 0)),
                new ArrayList<>(Arrays.asList(0, 0))
        ));
        int result = solver.getMaxPath(matrix, 0, 0, 1, 1);
        assertEquals(0, result);
    }
}