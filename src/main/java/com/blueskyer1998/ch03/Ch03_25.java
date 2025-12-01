package com.blueskyer1998.ch03;

/**
 * 使用具名常數 PI，將它應用在計算圓面積和圓周長
 */
public class Ch03_25 {
    public static void main(String[] args) {
        final double PI;
        int r = 5;
        PI = 3.14159;

        System.out.println("圓面積 = " + PI * r * r);
        System.out.println("圓周長 = " + 2 * PI * r);
    }
}
