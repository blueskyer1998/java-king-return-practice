package com.blueskyer1998.ch03;

/**
 * 重新設計 ch03_25.java，定義具名常數 PI 時同時設定其初值
 */
public class Ch03_26 {
    public static void main(String[] args) {
        final double PI = 3.14159;     // 建議的作法：在定義時就設定初值
        int r = 5;

        System.out.println("圓面積 = " + PI * r * r);
        System.out.println("圓周長 = " + 2 * PI * r);
    }
}
