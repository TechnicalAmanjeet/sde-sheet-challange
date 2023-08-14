package Day0001;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {
    public static void main(String[] args) {

    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i=0; i<n; ++i) {
            for(int j=0; j<m; ++j) {
                if (matrix[i][j] == 0)  {
                    x.add(i);
                    y.add(j);
                }
            }
        }

        for (int i: x) {
            for (int j=0;j<m; ++j) matrix[i][j] = 0;
        }

        for (int j: y) {
            for (int i=0;i<n;++i) matrix[i][j] = 0;
        }
    }
}
