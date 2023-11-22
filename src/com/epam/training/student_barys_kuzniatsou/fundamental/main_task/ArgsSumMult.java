package com.epam.training.student_barys_kuzniatsou.fundamental.main_task;

public class ArgsSumMult {
    public static void main(String[] args) {
        int sum = 0;
        int mult = 1;

        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            mult *= Integer.parseInt(args[i]);
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mult: " + mult);
    }
}
