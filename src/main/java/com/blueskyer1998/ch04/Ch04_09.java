package com.blueskyer1998.ch04;

/**
 * 正無限大 Infinite 與負無限大 -Infinite
 */
public class Ch04_09 {
    public static void main(String[] args) {
        double x;
        x = 100.0 / 0;
        System.out.println("x = " + x);
        x = -100.0 / 0;
        System.out.println("x = " + x);
    }
}
