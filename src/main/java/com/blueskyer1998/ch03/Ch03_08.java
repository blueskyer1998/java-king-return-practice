package com.blueskyer1998.ch03;

/**
 * 不同位數整數輸出的應用
 */
public class Ch03_08 {
    public static void main(String[] Args) {
        int x;
        long y;
        x = 103;    // 設定10進位數
        System.out.println("列印 103 的值 = " + x);
        x = 0b111;   // 設定2進位整數
        System.out.println("列印 ob111 的值 = " + x);
        y  = 022;    // 設定8進位整數
        System.out.println("列印 022 的值 = " + y);
        y  = 0x2B;    // 設定16進位整數
        System.out.println("列印 0x2B 的值 = " + y);
    }
}
