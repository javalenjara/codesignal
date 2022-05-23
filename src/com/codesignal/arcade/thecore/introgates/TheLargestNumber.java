package com.codesignal.arcade.thecore.introgates;

public class TheLargestNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(solution(n));
    }

    static int solution(int n) {
        return (int) (Math.pow(10, n)) - 1;
    }
}
