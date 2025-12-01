package com.blueskyer1998.Ch03;

/**
 * 如果每個月花費是 9000 元，用變數 y 儲存一年所花的錢，用變數 s 儲存一年可以儲存多少錢
 */
public class Ch03_02 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int s;
        x = 120;
        z = x * 8 * 300;
        y = 9000 * 12;
        s = z - y;
        System.out.println("一年可以存: " + s);
    }

}
