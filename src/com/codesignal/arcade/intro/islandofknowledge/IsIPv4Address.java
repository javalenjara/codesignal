package com.codesignal.arcade.intro.islandofknowledge;

import java.util.stream.Stream;

public class IsIPv4Address {

	public static void main(String[] args) {
		
		String ip = "172.16.321.1";
		System.out.println(isIPv4Address(ip));
	}
	
	private static boolean isIPv4Address(String inputString) {
		if(! inputString.matches("([0-9]{1,3}\\.){3}[0-9]{1,3}")) {
			return false;
		}

		return Stream.of(inputString.split("\\.")).allMatch(x -> Integer.parseInt(x) >= 0 && Integer.parseInt(x) <= 255);
	}
}