package com.codesignal.arcade.intro.islandofknowledge;

public class AreEquallyStrong {

    public static void main(String[] args) {

        System.out.println(areEquallyStrong(10, 15, 15, 10));
    }

    private static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return
            Math.max(yourLeft, yourRight) == Math.max(friendsLeft, friendsRight)
                &&
                Math.min(yourLeft, yourRight) == Math.min(friendsLeft, friendsRight);
    }
}
