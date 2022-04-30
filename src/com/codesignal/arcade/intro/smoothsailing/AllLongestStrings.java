package com.codesignal.arcade.intro.smoothsailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllLongestStrings {
    public static void main(String[] args) {

        String[] inputArray = {"abc", "eeee", "abcd", "dcd"};
        String[] result = allLongestStrings(inputArray);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static String[] allLongestStrings(String[] inputArray) {
        int maxLength = inputArray[0].length();
        Map<Integer, ArrayList<String>> longestStrings = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i].length() >= maxLength) {
                maxLength = inputArray[i].length();
                if(longestStrings.containsKey(maxLength)) {
                    ArrayList<String> existingValues = longestStrings.get(maxLength);
                    existingValues.add(inputArray[i]);
                    longestStrings.put(maxLength, existingValues);
                } else {
                    ArrayList<String> newValues = new ArrayList<>();
                    newValues.add(inputArray[i]);
                    longestStrings.put(maxLength, newValues);
                }
            }
        }
        String[] result = new String[longestStrings.get(maxLength).size()];
        return longestStrings.get(maxLength).toArray(result);
    }
}
