package com.blueskyer1998.ch03;

/**
 * 格式化輸出，靠左對齊的實例
 */
public class Ch03_28 {
    public static void main(String[] Args) {
        int x = 100;
        double y = 10.5;
        String s = "Deep";

        System.out.printf("x=/%-6d/%n", x);
        System.out.printf("y=/%-6.2f/%n", y);
        System.out.printf("s=/%-6s/%n", s);
    }
}
