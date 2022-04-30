package com.codesignal.arcade.intro.edgeoftheocean;

public class MatrixElementsSum {
	
	public static void main(String[] args) {
		int[][] testMatrix = {
				{1, 1, 1, 0}, 
				{0, 5, 0, 1},
				{2, 1, 3, 10}
				};

		System.out.println(matrixElementsSum(testMatrix));
	}
	
	static int matrixElementsSum(int[][] matrix) {
		int sum = 0;
		for(int i = 0; i < matrix[0].length; i++){
			for(int j = 0; j < matrix.length; j++){
				if (matrix[j][i] == 0) break;
				else sum += matrix[j][i];
			}
		}
		return sum;
	}

}
