package com.codesignal.arcade.intro;

/**
 * Created by javalenja on 13-May-20
 */

public class AlmostIncreasingSequenceClass {

    public static void main(String[] args) {
        int[] testArray = {1, 2, 1, 2};
        System.out.println(almostIncreasingSequence(testArray));
    }

    static boolean almostIncreasingSequence(int[] sequence) {
        if (sequence.length <= 2) return true;
        else {
            int countGaps = 0;
            for(int i = 0; i < sequence.length - 1; i++){
                if(countGaps <= 1){
                    if(!(sequence[i] < sequence[i + 1])){
                        countGaps++;
                    }
                    else if(((i + 2) < sequence.length) && !(sequence[i] <= sequence[i + 2])){
                        return false;
                    }
                }
                else return false;
                System.out.println("Gaps: " + countGaps + "; i: " + i);
            }

            return countGaps <= 1;
        }
    }
}
