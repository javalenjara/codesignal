package com.codesignal.interviews;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        final String input = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
        System.out.println(solution(input));
    }

    private static char solution(String s) {
        if (s.length() != 0) {
            char[] inputToArray = s.toCharArray();
            Map<Character, Integer> stringMap = new LinkedHashMap<>();
            for (int i = 0; i < inputToArray.length; i++) {
                if (!stringMap.containsKey(inputToArray[i])) {
                    stringMap.put(inputToArray[i], 1);
                } else {
                    int count = stringMap.get(inputToArray[i]) + 1;
                    stringMap.put(inputToArray[i], count);
                }
            }
            Map.Entry<Character, Integer> characterIntegerEntry = stringMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .orElse(null);
            if (Objects.nonNull(characterIntegerEntry)) {
                return characterIntegerEntry.getKey().charValue();
            }
        }
        return '_';
    }
}
