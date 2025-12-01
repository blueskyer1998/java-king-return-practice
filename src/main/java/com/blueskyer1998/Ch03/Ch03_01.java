package com.blueskyer1998.Ch03;

/**
 * 每小時時薪是 120 元，一天工作 8 小時，一年工作 300 天；
 * 請計算一年可以賺多少錢，用變數 z 儲存一年所賺的錢
 *
 */
public class Ch03_01 {
    public static void main(String[] args) {
        int x;
        int z;
        x = 120;
        z = x * 8 * 300;
        System.out.println("一年可以賺: " + z);
    }
}
