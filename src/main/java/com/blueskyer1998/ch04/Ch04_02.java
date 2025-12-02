package com.blueskyer1998.ch04;

/**
 * 將運算式當作運算元的操作
 */
public class Ch04_02 {
    public static void main(String[] args) {
        int x, y, z;
        x = (y = 10) + (z = 100);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
