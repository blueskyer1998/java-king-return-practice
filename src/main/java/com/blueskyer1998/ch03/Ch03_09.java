package com.blueskyer1998.ch03;

/**
 * 長整數加底線數字表示法的應用
 */
public class Ch03_09 {
    public static void main(String[] args) {
        long x;

        x = 10345678L;  // 設定10進位長整數
        System.out.println("列印10345678的結果 = " + x);
        x = 1_000_200;  // 設定含底線整數
        System.out.println("列印1_000_200的結果 = " + x);
        x = 20_000;  // 設定含底線整數
        System.out.println("列印20_000的結果 = " + x);
    }
}
