package com.blueskyer1998.ch04;

/**
 * >>> 運算子的應用，位元右移時最左位元補0的應用
 */
public class Ch04_28 {
    public static void main(String[] args) {
        int x, y;
        x = 0b00000000000000000000000000000101;
        y = 0b11111111111111111111111111111000;
        System.out.println("x = " + x); // 00000000 ... 00000101 = 5
        System.out.println("x >>> 1 = " + (x >>> 1));   // 00000000 ... 00000010 = 2
        System.out.println("x >>> 2 = " + (x >>> 2));   // 00000000 ... 00000001 = 1
        System.out.println("y = " + y); // 11111111 ... 11111000 = -8
        System.out.println("y >>> 1 = " + (y >>> 1));   // 01111111 ... 11111100 = 2147483644
        System.out.println("y >>> 2 = " + (y >>> 2));   // 01111111 ... 11111110 = 1073741822
        System.out.println("y >>> 3 = " + (y >>> 3));   // 01111111 ... 11111111 = 536870911
    }
}
