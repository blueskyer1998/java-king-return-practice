package com.blueskyer1998.ch04;

import java.util.Scanner;

/**
 * 使用 print() 取代 println()
 * 使游標不換行
 */
public class Ch04_44 {
    public static void main(String[] args) {
        int x1, x2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入 2 個整數 (數字間用空白隔開)：");
        x1 = scanner.nextInt();
        x2 = scanner.nextInt();

        System.out.println("你輸入的第一個數字是：" + x1);
        System.out.println("你輸入的第二個數字是：" + x2);
        System.out.println("數字總和是：" + (x1 + x2));
    }
}
