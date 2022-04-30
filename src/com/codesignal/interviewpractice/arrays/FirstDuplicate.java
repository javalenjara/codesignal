package com.codesignal.interviewpractice.arrays;

/*
Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number
for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated
numbers, return the number for which the second occurrence has a smaller index than the second occurrence
of the other number does. If there are no such elements, return -1.
 */

import java.util.Arrays;

public class FirstDuplicate {

    public static void main(String[] args) {

        int[] test = {};
        System.out.println(firstDuplicate(test));
    }

    private static int firstDuplicate(int[] a) {

        int result = -1;

        if (a.length < 2){
            return result;
        }
        else if (allEquals(a)){
            result = a[0];
            return result;
        }
        else {
            int minIndex = a.length - 1;
            for (int i = 0; i < minIndex; i++) {
                for (int j = i + 1; j < a.length ; j++) {
                    if (a[i] == a[j] && j <= minIndex) {
                        result = a[i];
                        minIndex = j;
                        break;
                    }
                }
            }
            return result;
        }
    }

    private static boolean allEquals(int[] arr) {

        int maxOfArr = Arrays.stream(arr).max().getAsInt();
        int minOfArr = Arrays.stream(arr).min().getAsInt();
        return maxOfArr == minOfArr;
    }
}
