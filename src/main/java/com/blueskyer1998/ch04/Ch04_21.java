package com.blueskyer1998.ch04;

/**
 * 三元運算子的應用，分別列出較大值與較小值
 */
public class Ch04_21 {
    public static void main(String[] args) {
        int x, y, larger, smaller;
        x = 100;
        y = 50;
        larger = x > y ? x : y;
        System.out.println("較大值：" + larger);
        smaller = x < y ? x : y;
        System.out.println("較小值：" + smaller);
    }
}
