package com.epam.training.student_barys_kuzniatsou.fundamental.optional_task1;

import java.util.Scanner;
/*
* Ввести n чисел с консоли.
* 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */
public class MaxMinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of digits: ");
        int numberOfDigits = scanner.nextInt();

        double[] numbers = new double[numberOfDigits];

        initializingArrayDouble(numbers);

        int[] lengthNumbers = getLengthArray(numbers);

        int maxLength = getMaxLength(lengthNumbers);
        int minLength = getMinLength(lengthNumbers);

        System.out.println("Numbers with max length:");
        for (int i = 0; i < numberOfDigits; i++) {
            if (maxLength == lengthNumbers[i]) {
                System.out.println("Number: " + numbers[i]);
            }
        }

        if (maxLength == minLength) {
            System.out.println("Max length = min length");
        } else {
            System.out.println("Numbers with min length:");
            for (int i = 0; i < numberOfDigits; i++) {
                if (minLength == lengthNumbers[i]) {
                    System.out.println("Number: " + numbers[i]);
                }
            }
        }
    }

    public static void initializingArrayDouble(double[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the ["+(i+1)+"] number: ");
            array[i] = scanner.nextDouble();
            System.out.println();
        }
    }

    private static int[] getLengthArray(double[] array) {
        int[] arrayLength = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayLength[i] = Double.toString(Math.abs(array[i])).length() - 1;
        }

        return arrayLength;
    }

    private static int getMaxLength(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (maxValue <= array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    private static int getMinLength(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (minValue >= array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
