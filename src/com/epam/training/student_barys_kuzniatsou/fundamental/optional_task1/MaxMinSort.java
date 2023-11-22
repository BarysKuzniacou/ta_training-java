package com.epam.training.student_barys_kuzniatsou.fundamental.optional_task1;

import java.util.Scanner;

/*
 * Ввести n чисел с консоли.
 * 2. Вывести числа в порядке возрастания (убывания) значений их длины.
 */

public class MaxMinSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of digits: ");
        int numberOfDigits = scanner.nextInt();

        double[] numbers = new double[numberOfDigits];

        initializingArrayDouble(numbers);

        int[] lengthNumbers = getLengthArray(numbers);

        // the old code

        double[] numbersSort = new double[numberOfDigits];
        int[] lengthNumbersSort = new int[numberOfDigits];

        System.arraycopy(numbers, 0, numbersSort, 0, numberOfDigits);
        System.arraycopy(lengthNumbers, 0, lengthNumbersSort, 0, numberOfDigits);

        boolean flagSorted = false;
        int bufferForLength;
        double bufferForValue;
        while (!flagSorted) {
            flagSorted = true;
            for (int i = 0; i < numberOfDigits-1; i++) {
                if (lengthNumbersSort[i] > lengthNumbersSort[i+1]) {
                    flagSorted = false;

                    bufferForLength = lengthNumbersSort[i];
                    lengthNumbersSort[i] = lengthNumbersSort[i+1];
                    lengthNumbersSort[i+1] = bufferForLength;

                    bufferForValue = numbersSort[i];
                    numbersSort[i] = numbersSort[i+1];
                    numbersSort[i+1] = bufferForValue;
                }
            }
        }

        System.out.println("Sorted from min to max length");
        for (int i = 0; i < numberOfDigits; i++) {
            System.out.println("Length: " + lengthNumbersSort[i] + " Value: " + numbersSort[i]);
        }
        System.out.println("Sorted from max to min length");
        for (int i = numberOfDigits-1; i >= 0; i--) {
            System.out.println("Length: " + lengthNumbersSort[i] + " Value: " + numbersSort[i]);
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
}
