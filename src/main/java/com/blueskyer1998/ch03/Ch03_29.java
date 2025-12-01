package com.blueskyer1998.ch03;

/**
 * 格式化輸出，正值資料將出現正號(+)
 */
public class Ch03_29 {
    public static void main(String[] args) {
        int x = 100;
        double y = 10.5;

        System.out.printf("x=/%+6d/%n", x);
        System.out.printf("y=/%+6.2f/%n", y);
    }
}
