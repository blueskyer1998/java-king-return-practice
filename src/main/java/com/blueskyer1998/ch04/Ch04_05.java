package com.blueskyer1998.ch04;

/**
 * 稚園班上有 20 人，有 90 顆葡萄
 * 請問每位幼稚園學生可以分幾顆葡萄
 * 同時會剩下多少顆葡萄呢？
 *
 * 計算 2 的 3 次方
 */
public class Ch04_05 {
    public static void main(String[] args) {
        int students = 20;
        int grapes = 90;
        int count = grapes / students;
        int left = grapes % students;
        System.out.println("每人分到 = " + count);
        System.out.println("剩下 = " + left);

        int x1 = 2;
        int x2 = 3;
        double y;

        y = Math.pow(x1, x2);
        System.out.println(y);
    }
}
