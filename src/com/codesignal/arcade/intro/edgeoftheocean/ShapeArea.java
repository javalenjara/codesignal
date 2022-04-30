package com.codesignal.arcade.intro.edgeoftheocean;

/**
 * Created by javalenja on 13-May-20
 */

public class ShapeArea {
    public static void main(String[] args) {
        ShapeArea app = new ShapeArea();
        System.out.println(app.shapeArea(100));
    }

    private int shapeArea(int n) {
        return (2 * n * n) - (2 * n) + 1;
    }
}
