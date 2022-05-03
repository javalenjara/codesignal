package com.codesignal.arcade.intro.edgeoftheocean;

/**
 * Created by javalenja on 13-May-20
 */

public class AlmostIncreasingSequence {

    public static void main(String[] args) {
        int[] testArray = {1, 2, 1, 2};
        System.out.println(almostIncreasingSequence(testArray));
    }

    static boolean almostIncreasingSequence(int[] sequence) {
        if (sequence.length <= 2) {
            return true;
        }
        int errors = 0;
        for(int i = 0; i < sequence.length - 1; i++){
            if(sequence[i] >= sequence[i + 1]){
                errors++;
            }
            if(((i + 2) <= sequence.length - 1)
                && (i - 1) >= 0
                && (sequence[i] >= sequence[i + 2])
                && (sequence[i - 1] >= sequence[i + 1])){
                return false;
            }
        }
        return errors <= 1;
    }
}
