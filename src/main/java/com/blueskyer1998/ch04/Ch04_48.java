package com.blueskyer1998.ch04;

/**
 * 用完整名稱處理 System.out.println() 方法"
 */
public class Ch04_48 {
    public static void main(String[] args) {
        String x;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        java.lang.System.out.print("請輸入姓名: ");
        x = scanner.next();
        java.lang.System.out.printf("嗨! %s 歡迎使用本系統", x);
    }
}
