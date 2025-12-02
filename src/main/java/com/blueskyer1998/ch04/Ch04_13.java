package com.blueskyer1998.ch04;

/**
 * 複合指定運算子的實例
 */
public class Ch04_13 {
    public static void main(String[] args) {
        int a, b = 5;
        a = 10;
        a += b;
        System.out.println("x = " + a);

        a = 10;
        a -= b;
        System.out.println("x = " + a);

        a = 10;
        a *= b;
        System.out.println("x = " + a);

        a = 10;
        a /= b;
        System.out.println("x = " + a);

        a = 10;
        a %= b;
        System.out.println("x = " + a);
    }
}
