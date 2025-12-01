package com.blueskyer1998.ch03;

/**
 * 使用同一行內宣告多個變數
 */
public class Ch03_03 {
    public static void main(String[] args) {
        int x, y, z, s;

        x = 120;
        z = x * 8 * 300;
        y = 9000 * 12;
        s = z - y;
        System.out.println("一年可以存: " + s);
    }
}
