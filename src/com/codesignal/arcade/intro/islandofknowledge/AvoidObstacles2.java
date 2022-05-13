package com.codesignal.arcade.intro.islandofknowledge;

import java.util.Arrays;

public class AvoidObstacles2 {
	
	public static void main(String[] args) {
		int[] test = {1000, 999};
		System.out.println(avoidObstacles(test));
	}
	
	private static int avoidObstacles(int[] inputArray) {
		int i = 2;
		while (true) {
			int finalI = i;
			if (Arrays.stream(inputArray).noneMatch(value -> value % finalI == 0)) {
				return i;
			}
			i++;
		}
	}
}
