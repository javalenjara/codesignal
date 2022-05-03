package com.codesignal.arcade.intro.exploringthewaters;

import java.util.Collections;

public class AddBorder {

	public static void main(String[] args) {
		String[] test = {"a"};
		
		String[] result = addBorder(test);
		
		for (String value : result) {
			System.out.println(value);
		}
	}
	
	private static String[] addBorder(String[] picture) {
		
		int repeat = picture[0].length() + 2;
		String[] toReturn = new String[picture.length + 2];
		String toAppend = String.join("", Collections.nCopies(repeat, "*"));
		toReturn[0] = toAppend;
		toReturn[toReturn.length - 1] = toAppend;
		
		StringBuilder strBuild = new StringBuilder();
		
		for (int i = 1; i < toReturn.length - 1; i++) {
			strBuild.append("*");
			strBuild.append(picture[i - 1]);
			strBuild.append("*");
			toReturn[i] = strBuild.toString();
			strBuild.delete(0, strBuild.length());
		}
		return toReturn;
	}
}
