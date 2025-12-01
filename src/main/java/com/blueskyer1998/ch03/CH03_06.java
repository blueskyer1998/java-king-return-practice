package com.blueskyer1998.ch03;

/**
 * 為程式碼加上註解
 */
public class CH03_06 {
    public static void main (String[] Args) {
        int hourSalary = 120; // 每小時薪資
        int monthlyFee = 9000; // 每月支出
        int annualSalary, annualFee, annualSavings;

        annualSalary = hourSalary * 8 * 300; // 計算年薪
        annualFee = monthlyFee * 12; // 計算年支出
        annualSavings = annualSalary - annualFee; // 計算年儲蓄
        System.out.println("一年可以儲存:" + annualSavings);
    }
}
