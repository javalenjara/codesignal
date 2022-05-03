package com.codesignal.arcade.intro.exploringthewaters;

public class ArrayChange {

	public static void main(String[] args) {
		int[] testA = {-787, -773, -93, 867, -28, 118, 372, 255, 355, 598, -179, -752, 794, 961, -84, 296, -714, 14, 666, -265, -905, 942, -691, -379, -698, -650, 637, 523, 709, -674, 574, -239, 805, -434, 597, -677, 664, 384, 726, -389, -387, 772, -603, 685, 249, 446, -631, 454, 983, 867, -158, 932, -440, 891, -12, 400, -916, 503, 185, -802, -255, 207, -952, -506, -689, 425, 747, -907, -30, 102, 553, 981, -664, 75, -957, -42, 99, -750, -277, 686, -884, -972, 470, 32, 439, 163, 887, 895, -555, -654, 793, 333, 143, 73, 181, -512, -915, -68, 542, 799};
		System.out.println(arrayChange(testA));
	}
	
	private static int arrayChange(int[] inputArray) {
		int result = 0;
		for (int i = 0; i < inputArray.length - 1; i++) {
			while (inputArray[i] >= inputArray[i + 1]) {
				result++;
				inputArray[i + 1]++;
			}
		}
		return result;
	}
}
