package com.codesignal.arcade.intro.exploringthewaters;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatingSums {

	public static void main(String[] args) {
		int[] test = {50, 60, 60, 45, 70};
		Arrays.stream(alternatingSums(test)).forEach(System.out::println);
	}
	
	private static int[] alternatingSums(int[] a) {
		
		int[] toReturn = new int[2];
		ArrayList<Integer> evenValues = new ArrayList<>();
		ArrayList<Integer> oddValues = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if(i % 2 == 0) evenValues.add(Integer.valueOf(a[i]));
			else oddValues.add(Integer.valueOf(a[i]));
		}
		toReturn[0] = evenValues.stream().reduce(0, Integer::sum);
		toReturn[1] = oddValues.stream().reduce(0, Integer::sum);
		return toReturn;
	}

}
