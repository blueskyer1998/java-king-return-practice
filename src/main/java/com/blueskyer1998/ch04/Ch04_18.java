package com.blueskyer1998.ch04;

/**
 * 列出 && 和 & 運算時的差異
 */
public class Ch04_18 {
    public static void main(String[] args) {
        boolean a = false;
        int i = 5;
        System.out.println("a && (i++ == 5) 結果 = " + (a && (i++ == 5)));
        System.out.println("i = " + i);
        i = 5;
        System.out.println("a & (i++ == 5) 結果 = " + (a & (i++ == 5)));
        System.out.println("i = " + i);
    }
}
