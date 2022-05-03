package com.codesignal.arcade.intro.smoothsailing;

public class IsLucky {

	public static void main(String[] args) {
		System.out.println(isLucky(239017));
	}
	
	private static boolean isLucky(int n) {
	    StringBuilder strBuild = new StringBuilder(String.valueOf(n));
	    int sumHalfOne = 0;
	    int sumHalfTwo = 0;
	    int half = strBuild.length()/2;
	    for(int i = 0; i < half; i++){
	    	sumHalfOne += Integer.parseInt(String.valueOf(strBuild.charAt(i)));
	    	sumHalfTwo += Integer.parseInt(String.valueOf(strBuild.charAt(half + i)));
	    }

	    return sumHalfOne == sumHalfTwo;
	}

}
