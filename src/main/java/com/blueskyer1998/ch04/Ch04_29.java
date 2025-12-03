package com.blueskyer1998.ch04;

/**
 * 複合指定運算子在位元運算的應用
 */
public class Ch04_29 {
    public static void main(String[] args) {
        int x, y;
        x = 0b00000000000000000000000000000101;
        y = 0b11111111111111111111111111111000;
        x &= y; // x = x & y
        System.out.println("x = " + x);
        x = 0b00000000000000000000000000000101;
        x |= y; // x = x | y
        System.out.println("x = " + x);
        x = 0b00000000000000000000000000000101;
        x ^= y; // x = x ^ y
        System.out.println("x = " + x);
        y = 1;
        x = 0b00000000000000000000000000000101;
        x <<= y; // x = x << y
        System.out.println("x = " + x);
        x = 0b00000000000000000000000000000101;
        x >>= y; // x = x >> y
        System.out.println("x = " + x);
        x = 0b00000000000000000000000000000101;
        x >>>= y; // x = x >>> y
        System.out.println("x = " + x);
    }
}
