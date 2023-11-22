package com.epam.training.student_barys_kuzniatsou.fundamental.main_task;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        int monthNumber = getNumberOfMonthFromConsole();
        String month = identifyMonthByNumber(monthNumber);
        System.out.println(month);
    }

    private static int getNumberOfMonthFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        return scanner.nextInt();
    }

    private static String identifyMonthByNumber(int monthNumberToSwitch) {
        switch (monthNumberToSwitch) {
            case(1): return "January";
            case(2): return "February";
            case(3): return "March";
            case(4): return "April";
            case(5): return "May";
            case(6): return "June";
            case(7): return "July";
            case(8): return "August";
            case(9): return "September";
            case(10): return "October";
            case(11): return "November";
            case(12): return "December";
            default: throw new RuntimeException("error input");
        }
    }
}
