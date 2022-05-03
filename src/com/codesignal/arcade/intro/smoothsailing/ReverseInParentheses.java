package com.codesignal.arcade.intro.smoothsailing;

public class ReverseInParentheses {

	public static void main(String[] args) {
		String test = "foo(ab)baz";
		System.out.println(reverseInParentheses(test));
	}
	
	private static String reverseInParentheses(String inputString) {
		
		if(! inputString.contains("(")) {
			return inputString;
		}
		else {
			int beginIndex = inputString.lastIndexOf("(");
			int endIndex = inputString.indexOf(")", beginIndex);
			if (beginIndex == 0 && endIndex == beginIndex + 1) {
				return "";
			}
			else {
				StringBuilder preReturn = new StringBuilder();
				StringBuilder toReverse = new StringBuilder();
				
				toReverse.append(inputString.substring(beginIndex + 1, endIndex)).reverse();
				preReturn.append(inputString.substring(0, beginIndex));
				preReturn.append(toReverse.toString());
				preReturn.append(inputString.substring(endIndex + 1));
				return reverseInParentheses(preReturn.toString());
			}
		}
	}
	
}
