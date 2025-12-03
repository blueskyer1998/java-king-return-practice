package com.blueskyer1998.ch04;

/**
 * 一個含多個運算子的程式應用
 */
public class Ch04_30 {
    public static void main(String[] args) {
        int x;
        x = 9 * 4 << 3 + 2;
        System.out.println("x = " + x);
        x = (9 * 4) << (3 + 2);  // 建議寫法
        System.out.println("x = " + x);
    }

}
