package com.blueskyer1998.ch03;

/**
 * 請修改程式實例 Ch03_06.java
 * 將時薪改為 150 元，每個月花費改為 10000 元
 * 請計算一年可以儲存多少錢。
 */
public class Ex03_02 {
    public static void main (String[] Args) {
        int hourSalary = 150; // 每小時薪資
        int monthlyFee = 10000; // 每月支出
        int annualSalary, annualFee, annualSavings;

        annualSalary = hourSalary * 8 * 300; // 計算年薪
        annualFee = monthlyFee * 12; // 計算年支出
        annualSavings = annualSalary - annualFee; // 計算年儲蓄
        System.out.println("一年可以存:" + annualSavings);
    }
}
