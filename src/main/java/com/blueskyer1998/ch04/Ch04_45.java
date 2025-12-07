package com.blueskyer1998.ch04;

import java.util.Scanner;

/**
 * 使用 next() 讀取字串的應用
 */
public class Ch04_45 {
    public static void main(String[] args){
        String x;
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入姓名：");
        x = scanner.next();
        System.out.printf("哇！%s 歡迎使用本系統", x);
    }
}
