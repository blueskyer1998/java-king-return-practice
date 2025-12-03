package com.blueskyer1998.ch04;

/**
 * 左邊運算元資料型態較寬的應用
 */
public class Ch04_33 {
    public static void main(String[] args) {
        int x;
        byte i = 10;
        char ch = 'A';
        float y;

        x = i;  // 將 byte 轉為 int
        System.out.println("x = " + x);

        x = ch; // 將 char 轉為 int
        System.out.println("x = " + x);

        y = 10; // int 10 將轉 float
        System.out.println("y = " + y);
    }
}
