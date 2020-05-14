package com.codesignal.arcade.intro;

/**
 * Created by javalenja on 13-May-20
 */

public class Add {

    public static void main(String[] args) {
        Add app = new Add();
        System.out.println(app.add(2, 3));
    }

    private int add(int param1, int param2) {
        return param1 + param2;
    }
}
