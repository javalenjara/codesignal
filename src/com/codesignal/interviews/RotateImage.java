package com.codesignal.interviews;

public class RotateImage {

    public static void main(String[] args) {
        int[][] image = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] rotatedImg = solution(image);
        int size = rotatedImg.length;
        for (int i = 0; i < size; i++) {
            System.out.print("{");
            for (int j = 0; j < size; j++) {
                System.out.print(String.format(" %d ", rotatedImg[i][j]));
            }
            System.out.print("}\n");
        }
    }

    private static int[][] solution(int[][] a) {
        int size = a.length;
        int[][] rotatedImage = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotatedImage[j][size - i -1] = a[i][j];
            }
        }
        return rotatedImage;
    }
}
