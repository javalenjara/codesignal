package com.codesignal.arcade.thecore.introgates;

public class Candies {
    public static void main(String[] args) {
        int n = 3;
        int m = 10;
        System.out.println(solution(n, m));
    }

    static int solution(int n, int m) {
        return (m / n) * n;
    }
}
