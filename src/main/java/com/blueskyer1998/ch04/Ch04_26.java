package com.blueskyer1998.ch04;

/**
 * 位元左移的應用
 */
public class Ch04_26 {
    public static void main(String[] args) {
        int x, y;
        x = 0b00000000000000000000000000000101;
        y = 0b00100000000000000000000000000001;
        System.out.println("x = " + x); // 00000000 ... 00000101 = 5
        System.out.println("x << 1 = " + (x << 1)); // 0000000... 00001010 = 10
        System.out.println("x << 2 = " + (x << 2)); // 00000000 ... 00010100 = 20
        System.out.println("y = " + y); // 00100000 … 00000001 = 536870913
        System.out.println("y << 1 = " + (y << 1)); // 01000000 ... 00000010 = 1073741826
        System.out.println("y << 2 = " + (y << 2)); // 10000000 ... 00000100 = -2147483644（正負號更動）
        System.out.println("y << 3 = " + (y << 3)); // 00001000 ... 00001000 = 8（正負號更動）
    }
}
