package com.blueskyer1998.ch03;

/**
 * 列出4種整數資料型態的最大值與最小值
 */
public class Ch03_11 {
    public static void main(String[] args) {
        //  printf 可以 format（格式化）輸出
        System.out.printf("byte的最小值 = %d ~ %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short的最小值 = %d ~ %dn", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int的最小值 = %d ~ %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long的最小值 = %d ~ %d%n", Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
