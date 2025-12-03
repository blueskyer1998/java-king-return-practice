package com.blueskyer1998.ch04;

/**
 * 驗證上述 byte 資料從 127 … -128 之間的二進位表示法
 * 需留意的是當我們表達負數時，在 0b 前方要加上 (byte)
 * 這裡是強制將 0b11111111 整數 int 資料轉成 byte
 */
public class Ch04_22 {
    public static void main(String[] args) {
        byte i;
        i = 0b01111111;
        System.out.println("10進位輸出: " + i);
        i = 0b01111110;
        System.out.println("10進位輸出: " + i);
        i = 0b00000001;
        System.out.println("10進位輸出: " + i);
        i = 0b00000000;
        System.out.println("10進位輸出: " + i);
        i = (byte)0b11111111;
        System.out.println("10進位輸出: " + i);
        i = (byte)0B10000001;
        System.out.println("10進位輸出: " + i);
        i = (byte)0B10000000;
        System.out.println("10進位輸出: " + i);
    }
}
