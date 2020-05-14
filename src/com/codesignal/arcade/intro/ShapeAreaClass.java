package com.codesignal.arcade.intro;

/**
 * Created by javalenja on 13-May-20
 */

public class ShapeAreaClass {
    public static void main(String[] args) {
        ShapeAreaClass app = new ShapeAreaClass();
        System.out.println(app.shapeArea(100));
    }

    private int shapeArea(int n) {
        return (2 * n * n) - (2 * n) + 1;
    }
}
