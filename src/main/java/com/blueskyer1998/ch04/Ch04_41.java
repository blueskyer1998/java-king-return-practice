package com.blueskyer1998.ch04;

/**
 * 強制型態轉換的錯誤與應用
 */
public class Ch04_41 {
    public static void main(String[] args) {
        int x;
        byte y;
        x = 0b10000000;
        y = (byte) x;   // 強制轉型為 byte
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int x2 = 7;
        int y2 = 2;
        double z;
        z = x2 / y2;                    // 7 / 2 = 3 (整數除法，結果是整數)
        System.out.println("z = " + z); // 輸出：z = 3.0
        z = (double) x2 / y2;           // (double)7 / 2 = 3.5 (強制轉型後，結果是浮點數)
        System.out.println("z = " + z); // 輸出：z = 3.5
        System.out.println("z = " + (int) z);   // (int)3.5 = 3 (強制轉型為整數)
    }
}
