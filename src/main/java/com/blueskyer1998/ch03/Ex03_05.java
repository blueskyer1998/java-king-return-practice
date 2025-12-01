package com.blueskyer1998.ch03;

/**
 * 請宣告具名常數 PI 等於 3.14159
 * 當 r（半徑）是 10 和 20 時
 * 求圓面積和圓周長。
 */
public class Ex03_05 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        int r = 10;

        System.out.println("r = 10 時，圓周長 = " + 2 * r * PI);
        System.out.println("r = 10 時，圓面積 = " + r * r * PI);
        r = 20;
        System.out.println("r = 20 時，圓周長 = " + 2 * r * PI);
        System.out.println("r = 20 時，圓面積 = " + r * r * PI);
    }
}
