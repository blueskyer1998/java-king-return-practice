package com.blueskyer1998.ch04;

/**
 * 將整數轉為字串輸出的應用
 */
public class Ch04_42 {
    public static void main(String[] args) {
        int x1, x2;
        x1 = 17;
        x2 = -2;

        System.out.println("x1 的 2 進位是：" + Integer.toBinaryString(x1));
        System.out.println("x2 的 2 進位是：" + Integer.toBinaryString(x2));
        System.out.println("x1 的 8 進位是：" + Integer.toOctalString(x1));
        System.out.println("x2 的 8 進位是：" + Integer.toOctalString(x2));
        System.out.println("x1 的 16 進位是：" + Integer.toHexString(x1));
        System.out.println("x2 的 16 進位是：" + Integer.toHexString(x2));
    }
}
