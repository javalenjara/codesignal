package com.codesignal.companychallenges.spacex;

/*The master launch sequence consists of several independent sequences for different systems.
Your goal is to verify that all the individual system sequences are in strictly increasing order.
In other words, for any two elements i and j (i < j) of the master launch sequence that belong to the same system
(having systemNames[i] = systemNames[j]), their values should be in strictly increasing order
(i.e. stepNumbers[i] < stepNumbers[j]).*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LaunchSequenceChecker {

    public static void main(String[] args) {
        String[] systemNames =  {"Dragon", "Falcon 9", "Dragon", "Falcon 9", "Falcon 9", "Dragon", "Dragon", "Dragon", "Falcon 10"};
        int[] stepNumbers = {1, 1, 3, 2, 4, 10, 20, 30, 4};
        System.out.println(solution(systemNames, stepNumbers));
    }

    static boolean solution(String[] systemNames, int[] stepNumbers) {
        Map<String, ArrayList<Integer>> systemsAndStepNumbers = new HashMap<>();
        for (int i = 0; i < systemNames.length; i++) {
            ArrayList<Integer> currentStepNumbers;
            if (!systemsAndStepNumbers.containsKey(systemNames[i])) {
                currentStepNumbers = new ArrayList<>();
                currentStepNumbers.add(stepNumbers[i]);
                systemsAndStepNumbers.put(systemNames[i], currentStepNumbers);
            }
            else {
                currentStepNumbers = systemsAndStepNumbers.get(systemNames[i]);
                int lastElement = currentStepNumbers.get(currentStepNumbers.size() - 1);
                if (stepNumbers[i] <= lastElement) {
                    return false;
                }
                currentStepNumbers.add(stepNumbers[i]);
            }
        }
        return true;
    }
}
