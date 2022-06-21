package com.codesignal.arcade.intro.throughthefog;

public class DepositProfit {

	public static void main(String[] args) {
		int toPrint = depositProfit(100, 20, 170);
		System.out.println(toPrint);

	}
	
	private static int depositProfit(int deposit, int rate, int threshold) {
		int numYears = 0;
		float factor = 1 + (rate  / 100f);
		float newDeposit = deposit;
		while (numYears > -1) {
			if (newDeposit >= threshold) {
				return numYears;
			}
			else {
				numYears++;
				newDeposit = newDeposit * factor;
			}
		}
		return numYears;
	}
}
