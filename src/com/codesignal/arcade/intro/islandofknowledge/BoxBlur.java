package com.codesignal.arcade.intro.islandofknowledge;

import java.util.Arrays;

public class BoxBlur {
    public static void main(String[] args) {
        int[][] image = {
            { 7, 4, 0, 1 },
            { 5, 6, 2, 2 },
            { 6, 10, 7, 8},
            { 1, 4, 2, 0 }};

        int[][] blurredImage = boxBlur(image);

        printMatrix(blurredImage);

    }

    static int[][] boxBlur(int[][] image) {
        final int rows = image.length - 2;
        final int cols = image[0].length - 2;
        int[][] solution = new int[rows][cols];
        for (int i = 0; i < cols; i++) {
            for (int j = i; j < rows; j++) {
                int sum = 0;
                for (int k = i; k < j + 3; k++) {
                    int[] subRow = Arrays.copyOfRange(image[k], k, k + 3);
                    sum += Arrays.stream(subRow).sum();
                }
                solution[j][i] = sum / 9;
            }
        }

        return solution;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
