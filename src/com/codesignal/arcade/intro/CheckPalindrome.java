package com.codesignal.arcade.intro;

/**
 * Created by javalenja on 13-May-20
 */

public class CheckPalindrome {

    public static void main(String[] args) {
        CheckPalindrome app = new CheckPalindrome();
        System.out.println(app.checkPalindrome("reconocer"));
    }

    private boolean checkPalindrome(String inputString) {
        StringBuilder checker = new StringBuilder(inputString);
        //takes advantage of the reverse function of StringBuilder.
        return inputString.equals(checker.reverse().toString());
    }
}
