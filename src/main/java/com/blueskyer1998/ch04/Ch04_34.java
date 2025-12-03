package com.blueskyer1998.ch04;

/**
 * 左邊變數運算元的資料型態數值範圍較窄的應用
 * 如果左邊變數運算元的資料型態數值範圍較窄
 * 而右邊運算元會被自動轉成左邊的變數運算元資料型態
 * 但是必須符合右邊的運算元結果是在左邊型態資料的變數範圍內
 */
public class Ch04_34 {
    public static void main(String[] args) {
        int x;
        char ch;
        x = 5;  // int 轉成 byte
        System.out.println("x = " + x);
        ch = 65;    // int 轉成 char
        System.out.println("ch = " + ch);
    }
}
