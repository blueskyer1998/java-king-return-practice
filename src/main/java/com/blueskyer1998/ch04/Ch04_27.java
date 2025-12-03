package com.blueskyer1998.ch04;

/**
 * >> 運算子的應用，位元右移時最左位元不變的應用
 */
public class Ch04_27 {
    public static void main(String[] args) {
        int x, y;
        x = 0b00000000000000000000000000000101;
        y = 0b11111111111111111111111111111000;
        System.out.println("x = " + x); // 0000000 ... 00000101 = 5
        System.out.println("x >> 1 = " + (x >> 1)); // 0000000 ... 00000010 = 2
        System.out.println("x >> 2 = " + (x >> 2)); // 0000000 ... 00000001 = 1
        System.out.println("y = " + y); // 11111111 ... 11111000 = -8
        System.out.println("y >> 1 = " + (y >> 1)); // 11111111 ... 11111100 = -4
        System.out.println("y >> 2 = " + (y >> 2)); // 11111111 ... 11111110 = -2
        System.out.println("y >> 3 = " + (y >> 3)); // 11111111 ... 11111111 = -1
    }
}
