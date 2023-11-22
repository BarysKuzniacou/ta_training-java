package com.epam.training.student_barys_kuzniatsou.fundamental.optional_task1;

import java.util.Scanner;

/*
 * Ввести n чисел с консоли.
 * 3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 */

public class AvgSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of digits: ");
        int numberOfDigits = scanner.nextInt();

        double[] numbers = new double[numberOfDigits];

        initializingArrayDouble(numbers);

        int[] lengthNumbers = getLengthArray(numbers);

        int sumOfLength = setSumOfArrayElements(lengthNumbers);
        int averageLength = setAverageValue(sumOfLength, numberOfDigits);

        System.out.println("Avg " + averageLength);
        System.out.println("Less than avg");
        for (int i = 0; i < numberOfDigits; i++) {
            if (lengthNumbers[i] < averageLength) {
                System.out.println("Value: " + numbers[i] + " Length: " + lengthNumbers[i]);
            }
        }

        System.out.println("Equal avg");
        for (int i = 0; i < numberOfDigits; i++) {
            if (lengthNumbers[i] == averageLength) {
                System.out.println("Value: " + numbers[i] + " Length: " + lengthNumbers[i]);
            }
        }

        System.out.println("More than avg");
        for (int i = 0; i < numberOfDigits; i++) {
            if (lengthNumbers[i] > averageLength) {
                System.out.println("Value: " + numbers[i] + " Length: " + lengthNumbers[i]);
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

    private static int setSumOfArrayElements(int[] arrayOfLengths) {
        int sumOfLengths = 0;
        for (int i = 0; i < arrayOfLengths.length; i++){
            sumOfLengths += arrayOfLengths[i];
        }
        return sumOfLengths;
    }

    private static int setAverageValue(int numerator, int denominator) {
        float averageResult = (float) numerator/(float)denominator;
        //System.out.println("Average length: " + averageResult);
        return (int)Math.round(averageResult);
    }

}
