package com.blueskyer1998.ch03;

/**
 * 字串輸出的運用
 */
public class Ch03_23 {
    public static void main(String[] args) {
        String str1 = "I like Java";
        String str2 = "I'm Eason";

        System.out.println(str1);   // 單獨列出字串str1
        System.out.println(str1 + str2);   // 字串相加等於字串結合
        System.out.println(str1 + '\t' + str2); // 字串結合中間是定位符號
        System.out.println(str1 + '\n' + str2);  // 字串結合中間是換行符號
    }
}
