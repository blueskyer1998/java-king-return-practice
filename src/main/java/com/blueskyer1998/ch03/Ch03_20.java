package com.blueskyer1998.ch03;

/**
 * 列出 Unicode 的值範圍
 * 測試逸出字元 \r（游標移至最左）
 * 測試逸出字元 \t（Tab 位移）
 */
public class Ch03_20 {
    public static void main(String[] args) {
        // %h 格式化為16進制
        System.out.printf("Unicode的範圍是 %h ~ %h%n", Character.MIN_VALUE, Character.MAX_VALUE);

        // 測試逸出字元 \r（游標移至最左）
        System.out.printf("abcdefghijklmnopq");
        System.out.println("\rAAA");

        // 測試逸出字元 \t（Tab 位移）
        System.out.printf("你好\t嗎");
    }
}
