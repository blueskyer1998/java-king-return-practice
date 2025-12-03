package com.blueskyer1998.ch04;

/**
 * 一個含多個運算子的程式應用
 */
public class Ch04_31 {
    public static void main(String[] args) {
        int x, i, j;
        i = j = 5;
        x = ++i + j++ * 3;
        System.out.println("x = " + x);
        x = i++ + ++j * 3;
        System.out.println("x = " + x);
    }
}
