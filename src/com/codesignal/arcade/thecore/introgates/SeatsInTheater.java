package com.codesignal.arcade.thecore.introgates;

public class SeatsInTheater {
    public static void main(String[] args) {
        int nCols = 16;
        int nRows = 11;
        int col = 5;
        int row = 3;

        System.out.println(solution(nCols, nRows, col, row));
    }

    static int solution(int nCols, int nRows, int col, int row) {
        return ((nCols - col) + 1) * (nRows - row);
    }
}
