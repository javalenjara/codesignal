package com.codesignal.arcade.intro.exploringthewaters;

public class AreSimilar {

	public static void main(String[] args) {
		int[] testA = {1, 2, 2};
		int[] testB = {2, 1, 1};
		System.out.println(areSimilar(testA, testB));
	}
	
	private static boolean areSimilar(int[] a, int[] b) {
		int countErrors = 0;
		int firstErrorPosition = -1;
		int secondErrorPosition = -1;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				countErrors++;
				if(countErrors > 2) {
					return false;
				}
				else {
					firstErrorPosition = (firstErrorPosition >= 0) ? firstErrorPosition : i;
					secondErrorPosition = i;
				}
			}
		}
		switch (countErrors) {
		case 0:
			return true;
		case 1:
			return false;
		default:
			return (a[firstErrorPosition] == b[secondErrorPosition] && a[secondErrorPosition] == b[firstErrorPosition]);
		}
	}
}
