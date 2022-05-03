package com.codesignal.arcade.intro.exploringthewaters;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PalindromeRearranging {

	public static void main(String[] args) {
		String test = "reconocer";
		System.out.println(palindromeRearranging(test));
	}
	
	static boolean palindromeRearranging(String inputString) {
		
		Map<Character, Long> treeMap = new TreeMap<>();
		List<Character> letters = inputString.chars()
		.distinct()
		.mapToObj(x -> (char) x).collect(Collectors.toList());
		long repetitions;
		
		for (Character thisCharacter : letters) {
			repetitions = inputString.chars().mapToObj(x -> (char) x).filter(y -> y.equals(thisCharacter)).count();
			treeMap.put(thisCharacter, Long.valueOf(repetitions));
		}
		
		long numOfEvens = treeMap.values().stream().filter(x -> x % 2L == 0).count();
		long numOfOds = treeMap.size() - numOfEvens;

		return numOfOds <= 1L;
	}
}
