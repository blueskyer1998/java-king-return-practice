package com.blueskyer1998.ch04;

import java.util.Scanner;

/**
 * 簡單讀字元並輸出的應用
 */
public class Ch04_45_2 {
    public static void main(String[] args){
        char ch;
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入字元：");
        ch = scanner.next().charAt(5);
        System.out.println("你輸入的字元是 " + ch);
    }
}
