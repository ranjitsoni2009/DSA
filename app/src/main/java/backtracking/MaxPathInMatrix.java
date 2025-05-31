package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ranjit Soni on 31-05-2025.
 * Author: ranjitsoni2009@gmail.com
 */
public class MaxPathInMatrix {
    int maxPath = Integer.MIN_VALUE;
    ArrayList<ArrayList<Integer>> directions = new ArrayList<>();
    int getMaxPath(ArrayList<ArrayList<Integer>> matrix, int sr, int sc, int dr, int dc) {
        if (matrix == null || matrix.isEmpty() || matrix.get(0).isEmpty()) {
            return 0;
        }

        ArrayList<ArrayList<Boolean>> visitedMatrix = new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++) {
            visitedMatrix.add(new ArrayList<>());
            for (int j = 0; j < matrix.get(0).size(); j++) {
                visitedMatrix.get(i).add(false);
            }
        }


        directions.add(new ArrayList<>(List.of(0, -1))); // Left
        directions.add(new ArrayList<>(List.of(-1, 0))); // Up
        directions.add(new ArrayList<>(List.of(0, 1))); // Right
        directions.add(new ArrayList<>(List.of(1, 0))); // Down
        int pathValue = 0;
        if (matrix.get(sr).get(sc)== 1) {
            pathValue = 1;
        }
        visitedMatrix.get(sr).set(sc, true);
        getMaxPathHelper(matrix, visitedMatrix, sr, sc, dr, dc, pathValue);

        return maxPath == Integer.MIN_VALUE ? 0 : maxPath;
    }

    private void getMaxPathHelper(ArrayList<ArrayList<Integer>> matrix, ArrayList<ArrayList<Boolean>> visitedMatrix, int nr, int nc, int dr, int dc, int pathValue) {
        if (nr == dr && nc == dc) {
            maxPath = Math.max(maxPath, pathValue);
            return;
        }

        for (ArrayList<Integer> direction : directions) {
            int newRow = nr + direction.get(0);
            int newCol = nc + direction.get(1);

            if (newRow >= 0 && newRow < matrix.size() && newCol >= 0 && newCol < matrix.get(0).size() && matrix.get(newRow).get(newCol) == 1 && !visitedMatrix.get(newRow).get(newCol)) {
                visitedMatrix.get(newRow).set(newCol, true);
                getMaxPathHelper(matrix, visitedMatrix, newRow, newCol, dr, dc, pathValue + 1);
                visitedMatrix.get(newRow).set(newCol, false);
            }
        }
    }
}
