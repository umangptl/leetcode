package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KWeakestRowsMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        // Create a list to store the indices and soldier counts of the rows
        List<int[]> rows = new ArrayList<>();

        // Iterate over the rows and calculate the number of soldiers in each row
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            rows.add(new int[]{i, count});
        }

        // Sort the rows based on the soldier counts
        Collections.sort(rows, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        // Create an array to store the indices of the k weakest rows
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rows.get(i)[0];
        }

        // Return the result
        return result;
    }

}
