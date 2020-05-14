package com.codesignal.arcade.intro;

/**
 * Created by javalenja on 13-May-20
 */

public class AdjacentElementsProduct {

    public static void main(String[] args) {
        AdjacentElementsProduct app = new AdjacentElementsProduct();
        int[] input = {5, 1, 2, 3, 1, 4};
        System.out.println(app.adjacentElementsProduct(input));
    }

    private int adjacentElementsProduct(int[] inputArray) {
        int maxProduct = inputArray[0] * inputArray[1];
        for(int i = 1; i < inputArray.length - 1; i++){
            if((inputArray[i] * inputArray[i+1]) >= maxProduct){
                maxProduct = inputArray[i] * inputArray[i+1];
            }
        }
        return maxProduct;
    }
}


