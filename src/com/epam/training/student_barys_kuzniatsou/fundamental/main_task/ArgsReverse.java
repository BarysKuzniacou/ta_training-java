package com.epam.training.student_barys_kuzniatsou.fundamental.main_task;

public class ArgsReverse {
    public static void main(String[] args) {
        for (int i = args.length-1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
