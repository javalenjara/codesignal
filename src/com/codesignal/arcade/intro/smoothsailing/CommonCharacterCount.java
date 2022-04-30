package com.codesignal.arcade.intro.smoothsailing;

public class CommonCharacterCount {
    public static void main(String[] args) {
        String input1 = "zzzz";
        String input2 = "zzzzzzz";
        System.out.println(commonCharacterCount(input1, input2));
    }

    private static int commonCharacterCount(String s1, String s2) {
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s2.contains(String.valueOf(s1.charAt(i)))){
                count++;
                s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
            }
        }
        return count;
    }
}
