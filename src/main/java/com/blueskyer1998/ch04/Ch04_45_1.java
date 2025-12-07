package com.blueskyer1998.ch04;

import java.util.Scanner;

/**
 * 使用 nextLine() 讀整行字串
 */
public class Ch04_45_1 {
    public static void main(String[] args){
        String x;
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入姓名：");
        x = scanner.nextLine();
        System.out.printf("哇！%s 歡迎使用本系統", x);
    }
}
