package com.blueskyer1998.ch03;

/**
 * 逸出字元的應用
 */
public class Ch03_19 {
    public static void main(String[] args) {
        char ch;

        ch = '\u0022';
        System.out.println("變數ch的內容 = " + ch);
        ch = '\'';
        System.out.println("變數ch的內容 = " + ch);
        ch = '\\';
        System.out.println("變數ch的內容 = " + ch);
    }
}
