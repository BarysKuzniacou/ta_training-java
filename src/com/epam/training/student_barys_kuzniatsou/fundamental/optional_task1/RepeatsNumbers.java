package com.epam.training.student_barys_kuzniatsou.fundamental.optional_task1;

import java.util.Scanner;

/*
 * Ввести n чисел с консоли.
 * 4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
 */
public class RepeatsNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of digits: ");
        int numberOfDigits = scanner.nextInt();

        double[] numbers = new double[numberOfDigits];

        initializingArrayDouble(numbers);

        int[] lengthNumbers = getLengthArray(numbers);

        int maxLength = getMaxLength(lengthNumbers);

        int[][] arrayForNumbersOfArrayValue = new int[numberOfDigits][maxLength];
        int[] arrayTemp = new int[numberOfDigits];                                      // изначальный массив
        int[][] numberRepeatsInArrayValue =  new int[numberOfDigits][10];
        int[] sumOfNumberRepeats =  new int[numberOfDigits];
        int[] multiplyOfNumberRepeats =  new int[numberOfDigits];


        for (int i = 0; i < numberOfDigits; i++) {
            arrayTemp[i] = lengthNumbers[i];
            multiplyOfNumberRepeats[i] = 1;
        }

        for (int i = 0; i < numberOfDigits; i++) {
            for (int j = 0; j < (lengthNumbers[i]); j++) {
                arrayForNumbersOfArrayValue[i][j] = arrayTemp[i] % 10;
                arrayTemp[i] = arrayTemp[i] / 10;
            }
        }

//        for (int i = 0; i < arrayDimension; i++) {
//            for (int j = 0; j < (arrayLengthOfElement[i]); j++) {
//                System.out.print("\t" + arrayForNumbersOfValue[i][j]);
//            }
//            System.out.print("\n");


        for (int i = 0; i < numberOfDigits; i++) {
            for (int j = 0; j < lengthNumbers[i]; j++) {
                switch (arrayForNumbersOfArrayValue[i][j]) {
                    case 0: numberRepeatsInArrayValue [i][0] +=1; break;
                    case 1: numberRepeatsInArrayValue [i][1] +=1; break;
                    case 2: numberRepeatsInArrayValue [i][2] +=1; break;
                    case 3: numberRepeatsInArrayValue [i][3] +=1; break;
                    case 4: numberRepeatsInArrayValue [i][4] +=1; break;
                    case 5: numberRepeatsInArrayValue [i][5] +=1; break;
                    case 6: numberRepeatsInArrayValue [i][6] +=1; break;
                    case 7: numberRepeatsInArrayValue [i][7] +=1; break;
                    case 8: numberRepeatsInArrayValue [i][8] +=1; break;
                    case 9: numberRepeatsInArrayValue [i][9] +=1; break;
                    default: System.out.println("Something wrong"); break;
                };
            }

        }

        for (int i = 0; i < numberOfDigits; i++) {
            //System.out.print("Value [" + (i+1) + "] ");
            for (int j = 0; j < 10; j++) {
                //System.out.print("\t" + numberRepeats[i][j]);
                sumOfNumberRepeats[i] += numberRepeatsInArrayValue[i][j];
                if (numberRepeatsInArrayValue[i][j] > 0) {
                    multiplyOfNumberRepeats[i] *= numberRepeatsInArrayValue[i][j];
                }
            }
        }

        int minOfSum = 99;
        int minOfMultiply = 99;
        int k = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            if (multiplyOfNumberRepeats[i] <= minOfMultiply && sumOfNumberRepeats[i] < minOfSum) {
                minOfSum = sumOfNumberRepeats[i];
                minOfMultiply = multiplyOfNumberRepeats[i];
                k = i;
            }
        }

        System.out.println("\n" + "The minimum number of distinct digits in a number " + k + ": " + numbers[k]);

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


}
