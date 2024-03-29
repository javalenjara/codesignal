package com.codesignal.arcade.intro.throughthefog;

/**
 * codesignal.com exercise number 32
 * */
public class AbsoluteValuesSumMinimization {
    public static void main(String[] args) {
        int[] input = {-10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        System.out.println(solution(input));
    }

    private static int solution(int[] a) {
        final int n = a.length;
        if (n % 2 == 0) {
            return Math.min(a[n / 2], a[(n / 2) - 1]);
        } else {
            return a[n / 2];
        }
    }
}
