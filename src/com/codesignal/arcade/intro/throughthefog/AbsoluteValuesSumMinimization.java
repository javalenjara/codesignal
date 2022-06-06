package com.codesignal.arcade.intro.throughthefog;

/**
 * codesignal.com exercise number 32
 * */
public class AbsoluteValuesSumMinimization {
    public static void main(String[] args) {

        int[] input = {1, 1, 3, 4};
        System.out.println(solution(input));
    }

    private static int solution(int[] a) {
        int[] partialSums = new int[a.length];
        partialSums[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            partialSums[i] = Math.abs(partialSums[i - 1] + a[i]);
        }
    }
}
