package com.blueskyer1998.ch03;

/**
 * 請設定矩形的高是 5 公尺和寬是 10 公尺，
 * 然後列出此矩形的面積和周長。
 */
public class Ex03_03 {
    public static void main(String[] args) {
        int height = 5;
        int weight = 10;

        System.out.println("矩形面積: " + height * weight + " 平方公尺");
        System.out.println("矩形周長: " + 2 * (height + weight) + " 公尺");
    }
}
