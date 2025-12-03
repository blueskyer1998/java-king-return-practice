package com.blueskyer1998.ch04;

/**
 * 修正 Ch04_38.java 的錯誤
 */
public class Ch04_40 {
    public static void main(String[] args) {
        int a;
        float x;
        a = 5;
        x = a * 10.0F;    // 強制將 10.0 改為 float
        System.out.println("x = " + x);
    }
}
