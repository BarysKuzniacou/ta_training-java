package com.epam.training.student_barys_kuzniatsou.fundamental.main_task;

import java.util.Random;
import java.util.Scanner;

public class RandomValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfValues;

        System.out.print("Enter the number of values: ");
        numberOfValues = scanner.nextInt();
        int[] values = getArrRandom(numberOfValues);
        outputInLine(values);
        outputWithBreak(values);
    }

    private static void outputWithBreak(int[] values) {
        System.out.println("Output with break:");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

    private static void outputInLine(int[] values) {
        System.out.print("Output in line: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] +" ");
        }
        System.out.println();
    }

    private static int[] getArrRandom(int numberOfValues) {
        int[] arrRandom = new int[numberOfValues];
        Random random = new Random();

        for (int i = 0; i < numberOfValues; i++) {
            arrRandom[i] = random.nextInt(100);
        }

        return arrRandom;
    }
}
