package com.blueskyer1998.ch03;

/**
 * 用有意義的變數名稱，計算一年可以存多少錢
 */
public class Ch03_05 {
    public static void main (String[] Args) {
        int hourSalary = 120;
        int monthlyFee = 9000;
        int annualSalary, annualFee, annualSavings;

        annualSalary = hourSalary * 8 * 300;
        annualFee = monthlyFee * 12;
        annualSavings = annualSalary - annualFee;
        System.out.println("一年可以存:" + annualSavings);
    }
}
