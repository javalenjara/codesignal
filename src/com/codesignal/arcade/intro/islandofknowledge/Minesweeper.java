package com.codesignal.arcade.intro.islandofknowledge;

import com.codesignal.utils.MatrixUtils;

public class Minesweeper {
    public static void main(String[] args) {

        boolean[][] matrix = {
                {true, false, false, true},
                {false, false, true, false},
                {true, true, false, true}
        };

        int[][] solution = solution(matrix);
        MatrixUtils.printMatrix(solution);

    }

    static int[][] solution(boolean[][] matrix) {
        int[][] solution = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]) {
                    sumOneAtPosition(solution, i - 1, j - 1);
                    sumOneAtPosition(solution, i - 1, j);
                    sumOneAtPosition(solution, i - 1, j + 1);
                    sumOneAtPosition(solution, i, j - 1);
                    sumOneAtPosition(solution, i, j + 1);
                    sumOneAtPosition(solution, i + 1, j - 1);
                    sumOneAtPosition(solution, i + 1, j);
                    sumOneAtPosition(solution, i + 1, j + 1);
                }
            }
        }
        return solution;
    }

    private static int[][] sumOneAtPosition(int[][] solution, int i, int j) {
        try {
            solution[i][j] += 1;
            return solution;
        }
        catch (IndexOutOfBoundsException outOfBoundsException) {
            return solution;
        }
    }

}
