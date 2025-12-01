package com.blueskyer1998.ch03;

/**
 * 設定變數時也可以直接設定變數的內容
 */
public class Ch03_04 {
    public static void main (String[] Args) {
        int x = 120;
        int y, z, s;

        z = x * 8 * 300;
        y = 9000 * 12;
        s = z - y;
        System.out.println("一年可以儲存:" + s);
    }
}
