package com.blueskyer1998.ch04;

/**
 * Java 語言控制運算的優先順序的應用
 */
public class Ch04_12 {
    public static void main(String[] args) {
        int x;
        x = (5 + 6) * 8 - 2;
        System.out.println("x = " + x);
        x = 5 + 6 * 8 - 2;
        System.out.println("x = " + x);
    }
}
