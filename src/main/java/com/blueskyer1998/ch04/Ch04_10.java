package com.blueskyer1998.ch04;

/**
 * 將整數除以 0，造成程式異常中止運作
 */
public class Ch04_10 {
    public static void main(String[] args) {
        double x;
        x = 100 / 0;    // 整數除以 0 造成程式異常而中止
        System.out.println("x = " + x);
    }
}
