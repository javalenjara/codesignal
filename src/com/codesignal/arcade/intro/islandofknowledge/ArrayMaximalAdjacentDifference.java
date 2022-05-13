package com.codesignal.arcade.intro.islandofknowledge;

public class ArrayMaximalAdjacentDifference {
    public static void main(String[] args) {

    }

    private static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int max = 0;
        for(int i = 0; i < inputArray.length - 1; i++){

            if(Math.abs(inputArray[i] - inputArray[i + 1]) >= max){
                max = Math.abs(inputArray[i] - inputArray[i + 1]);
            }
        }
        return max;
    }
}
