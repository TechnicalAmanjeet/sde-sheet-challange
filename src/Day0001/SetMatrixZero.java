package Day0001;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {
    public static void main(String[] args) {

    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRowZero = false, firstColumnZero = false;

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i<n; ++i)
            if (matrix[0][i] == 0) {
                firstRowZero = true;
                break;
            }
        for (int[] ints : matrix)
            if (ints[0] == 0) {
                firstColumnZero = true;
                break;
            }

        for (int i=1; i<m; ++i) {
            for(int j=1; j<n; ++j) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i=1; i<m; ++i) {
            for(int j=1; j<n; ++j) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
        }

        if (firstRowZero) {
            for (int i = 0; i<n; ++i) {
                matrix[0][i] = 0;
            }
        }

        if (firstColumnZero) {
            for (int i=0; i< m; ++i) {
                matrix[i][0] = 0;
            }
        }
    }
}
