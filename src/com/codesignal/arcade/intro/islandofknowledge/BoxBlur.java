package com.codesignal.arcade.intro.islandofknowledge;

import com.codesignal.utils.MatrixUtils;

public class BoxBlur {
    public static void main(String[] args) {
        int[][] image = {
                { 7, 4, 0, 1 },
                { 5, 6, 2, 2 },
                { 6, 10, 7, 8 },
                { 1, 4, 2, 0 }
        };

        int[][] blurredImage = boxBlur(image);

        MatrixUtils.printMatrix(blurredImage);

    }

    static int[][] boxBlur(int[][] image) {
        final int rows = image.length - 2;
        final int cols = image[0].length - 2;
        int[][] solution = new int[rows][cols];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                int sum = image[i - 1][j - 1] +
                        image[i - 1][j] +
                        image[i - 1][j + 1] +
                        image[i][j - 1] +
                        image[i][j] +
                        image[i][j + 1] +
                        image[i + 1][j - 1] +
                        image[i + 1][j] +
                        image[i + 1][j + 1];
                solution[i - 1][j - 1] = sum / 9;
            }
        }

        return solution;
    }
}
