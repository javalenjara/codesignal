package com.codesignal.dailychallenge;

public class AdditionWithoutCarryingClass {

    private int param1;

    public static void main(String[] args) {
	    AdditionWithoutCarryingClass app = new AdditionWithoutCarryingClass();
	    int result = app.additionWithoutCarrying(456, 17345);
        System.out.println(result);
        int prueba = (int) (Math.log10(456) + 1);
        System.out.println(prueba);
    }

    private int additionWithoutCarrying(int param1, int param2) {

        //1. convert the int number to String in order to find out its length.
        String num1 = String.valueOf(param1);
        String num2 = String.valueOf(param2);
        int tamanioNum1 = num1.length();
        int tamanioNum2 = num2.length();

        //2. build a formatter in order to pad with zeroes in the left
        String formatter = "%0" + Math.max(tamanioNum1, tamanioNum2) + "d";
        num2 = String.format(formatter, param2);
        num1 = String.format(formatter, param1);

        //3. construct a StringBuilder which saves the result as a string. Also, a simple integer to perform the
        // real arithmetic sum.
        StringBuilder resultBadSum = new StringBuilder();
        int digitSum;

        //4. for each String position I sum up the digits and ask if it's greater than 10 (more than 1 digit); if so,
        //I save only the right-most digit.
        for (int i = 0; i < Math.max(tamanioNum1, tamanioNum2); i++) {
            digitSum = Integer.parseInt(String.valueOf(num1.charAt(i)))
                    + Integer.parseInt(String.valueOf(num2.charAt(i)));
            if (digitSum < 10) {
                resultBadSum.append(digitSum);
            } else {
                resultBadSum.append(digitSum % 10); //% 10 preserves only the last digit.
            }
        }

        return Integer.parseInt(resultBadSum.toString());
    }
}
