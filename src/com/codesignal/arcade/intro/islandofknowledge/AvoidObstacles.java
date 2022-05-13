package com.codesignal.arcade.intro.islandofknowledge;

import java.util.Arrays;

public class AvoidObstacles {
	
	public static void main(String[] args) {
		int[] test = {1000, 999};
		System.out.println(avoidObstacles(test));
	}
	
	private static int avoidObstacles(int[] inputArray) {
		Arrays.sort(inputArray);
		int minJump = 2;
		int max = inputArray[inputArray.length - 1];
		while (minJump <= max) {
			for (int j = 0; j < inputArray.length; j++) {
				if (inputArray[j] % minJump == 0) {
					minJump++;
					break;
				}
				if (j == (inputArray.length - 1)) {
					return minJump;
				}
			}
		}
		return minJump;
	}
}
