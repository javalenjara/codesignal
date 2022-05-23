package com.codesignal.arcade.thecore.introgates;

import java.math.BigInteger;

public class MaxMultiple {
    /*
    Given a divisor and a bound, find the largest integer N such that:

    N is divisible by divisor.
    N is less than or equal to bound.
    N is greater than 0.
    It is guaranteed that such a number exists.
     */
    public static void main(String[] args) {
        int divisor = 10;
        int bound = 50;

        System.out.println(solution(divisor, bound));

    }

    static int solution(int divisor, int bound) {
        BigInteger num1 = new BigInteger(String.valueOf(divisor));
        BigInteger num2 = new BigInteger(String.valueOf(bound));
        BigInteger one = new BigInteger(String.valueOf(1));
        while(lcm(num1, num2).compareTo(num2) > 0) {
            num2 = num2.subtract(one);
        }
        return num2.intValue();
    }

    public static BigInteger lcm(BigInteger num1, BigInteger num2) {
        BigInteger gcd = num1.gcd(num2);
        return (num1.multiply(num2)).divide(gcd);
    }
}
