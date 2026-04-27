package com.blueskyer1998.ch04;

/**
 * 使用等差數列計算 1 - 100 的總和
 */
public class Ch04_52 {
    public static void main(String[] args) {
        int starting = 1;
        int ending = 100;
        int d = 1;
        int sum;

        sum = (starting + ending) * (ending - starting + 1) / 2;
        System.out.println("1 到 100 總和是: " + sum);
    }
}
