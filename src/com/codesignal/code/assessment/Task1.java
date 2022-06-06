package com.codesignal.code.assessment;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] test = {8, 5, 6, 16, 5};
        boolean[] solution = solution(test, 1, 3);
        for (int i = 0; i < solution.length; i++) {
            System.out.printf("%b, ", solution[i]);
        }

    }

    static boolean[] solution(int[] numbers, int left, int right) {
        //1. Check if numbers[i] % (i + 1) = 0
        //2. If 1 is true, check if left <= numbers[i] / (i + 1) <= right

        boolean[] result = new boolean[numbers.length];

        int x;
        for (int i = 0; i < numbers.length; i++) {
            x = numbers[i] / (i + 1);
            if (numbers[i] % (i + 1) == 0 && left <= x && x <= right) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }
        return result;
    }
}
