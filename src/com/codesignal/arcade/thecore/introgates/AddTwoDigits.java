package com.codesignal.arcade.thecore.introgates;

public class AddTwoDigits {
    public static void main(String[] args) {
        int test = 11;
        System.out.println(solution(test));

    }

    static int solution (int n) {
        return (n / 10) + (n % 10);
    }
}
