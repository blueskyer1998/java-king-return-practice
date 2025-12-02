package com.blueskyer1998.ch04;

/**
 * 前置與後置運算子的運用
 */
public class Ch04_07 {
    public static void main(String[] args) {
        int i, j, value;
        i = j = 10;
        value = ++i * 10;     // 前置運算
        System.out.println("value = " + value);
        System.out.println("i = " + i);
        value = j++ * 10;     // 後置運算
        System.out.println("value = " + value);
        System.out.println("j = " + j);
    }
}
