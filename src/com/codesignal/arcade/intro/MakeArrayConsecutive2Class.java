package com.codesignal.arcade.intro;

import java.util.Arrays;

/**
 * Created by javalenja on 13-May-20
 */

public class MakeArrayConsecutive2Class {

    public static void main(String[] args) {
        MakeArrayConsecutive2Class app = new MakeArrayConsecutive2Class();
        int[] test = {6, 2, 3, 8};
        System.out.println(app.makeArrayConsecutive2(test));
    }

    private int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues); //{2, 3, 6, 8}. Needs to be sorted in ascending order to find the missing ones.
        int count = 0;
        for(int i = 1; i < statues.length; i++){
            //the amount of missing statues is the subtraction of the current number minus his precedent minus 1,
            //because the number itself is'n taken into account. This approach assumes that the array is ordered,
            //in ascending order.
            count = count + (statues[i] - statues[i - 1] - 1);
        }
        return count;
    }
}
