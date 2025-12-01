package com.blueskyer1998.ch03;

/**
 * 列出 float 和 double 資料的2的指數最大值與最小值
 */
public class Ch03_15 {
    public static void main(String[] args) {
        System.out.printf("float 的指數範圍 = %d ~ %d%n", Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("double 的指數範圍 = %d ~ %d%n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);
    }
}
