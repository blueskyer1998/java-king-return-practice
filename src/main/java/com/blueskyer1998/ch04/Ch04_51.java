package com.blueskyer1998.ch04;

import java.util.Scanner;

/**
 * 請輸入攝氏溫度，輸出華式溫度
 */
public class Ch04_51 {
    public static void main(String[] args) {
        int c;
        double f;
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入攝氏溫度: ");
        c = scanner.nextInt();
        f = c * 9 / 5 + 32;
        System.out.printf("華氏溫度是: %6.2f", f);
    }
}
