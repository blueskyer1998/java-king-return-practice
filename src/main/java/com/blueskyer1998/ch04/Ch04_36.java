package com.blueskyer1998.ch04;

/**
 * 自動資料型態轉換的應用
 * 如果兩邊 operand 的資料型態不同，Java 編譯程式會依以下規則進行自動型態轉換：
 * 1. 若其中一個是 double → 另一個也轉成 double。
 * 2. 否則若其中一個是 float → 另一個轉成 float。
 * 3. 否則若其中一個是 long → 另一個轉成 long。
 * 4. 以上皆不符合 → 兩個 operand 轉成 int。
 */
public class Ch04_36 {
    public static void main(String[] args) {
        int x;
        double y;
        float z;
        long a;
        short x1 = 10;
        byte x2 = 5;

        y = (x = 10) + 3.3;     // 將 x 轉成 double
        System.out.println("y = " + y);

        z = x + 5.5F;           // 將 x 轉成 float
        System.out.println("z = " + z);

        a = x + 10L;            // 將 x 轉成 long
        System.out.println("a = " + a);

        x = x1 + x2;            // x1 和 x2 轉成 int
        System.out.println("x = " + x);
    }
}
