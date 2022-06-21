package com.codesignal.arcade.intro.throughthefog;

public class CircleOfNumbers {

	public static void main(String[] args) {
		
		int toPrint = circleOfNumbers(18, 5);
		System.out.println(toPrint);

	}

	private static int circleOfNumbers(int n, int firstNumber) {

		if (firstNumber >= (n/2)) {
			return firstNumber - (n/2);
		}
		else {
			return (n/2) + firstNumber;
		}
	}
}
