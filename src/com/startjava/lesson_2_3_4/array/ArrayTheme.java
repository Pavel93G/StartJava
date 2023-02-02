package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("Задача №1: Реверс значений массива.");
        int[] intArr = {2, 3, 4, 1, 5, 7, 6};
        int length = intArr.length;
        printArr(intArr);

        for(int i = 0; i < length / 2; i++) {
            int tmp = intArr[i];
            intArr[i] = intArr[length - i - 1];
            intArr[length - i - 1] = tmp;
        }
        printArr(intArr);

        System.out.print("\nЗадача №2: Вывод произведения элементов массива.");
        intArr = new int[10];
        length = intArr.length;

        for(int i = 0; i < length; i++) {
            intArr[i] = i;
        }

        int srcNum = 1;

        for(int i = 0; i < length - 1; i++) {
            srcNum *= intArr[i];
            System.out.print(intArr[i] + ((i < length - 2) ? " * " : " = " + srcNum));
        }
        System.out.printf("\nЗначение индекса '0'%d: " + intArr[0] +
                "\nЗначение индекса '9'%d: \n", + intArr[9], intArr[length - 1]);

        System.out.print("\nЗадача №3: Удаление элементов массива.");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        for(int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        double averageValue = doubleArr[length / 2];
        int count = 0;
        System.out.print("\nИсходный массив: ");
        for(int i = 0; i < length; i++) {
            if(i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", doubleArr[i]);
        }

        System.out.print("\nИзмененный массив: ");
        for(int i = 0; i < length; i++) {
            if(doubleArr[i] > averageValue) {
                doubleArr[i] = 0;
                count++;
            }
            if(doubleArr[i] == 8) {
                System.out.println();
            }
            System.out.printf(doubleArr[i] == 0 ? "%.0f  " : "%.3f  ", doubleArr[i]);
        }
        System.out.print("\nКолличество обнуленных ячеек: " + count );

        System.out.println("\n\nЗадача№4: Вывод элементов массива лесенкой в обратном порядке.");
        char[]charsArr = new char[26];
        length = charsArr.length;
        for(int i = 0; i < length; i++) {
            charsArr[i] = (char) (65 + i);
        }

        for(int i = 0; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(charsArr[length - 1 - j]);
            }
            System.out.print("\n");
        }

        System.out.println("\nЗадача№5: Генерация уникальных чисел.");
        intArr = new int[30];
        length = intArr.length;
        for(int i = 0; i < length; i++) {
            while (true) {
                boolean uniqueNums = false;
                int number = (int) (60 + Math.random() * 40);
                for(int j = 0; j < i; j++) {
                    if(number == intArr[j]) {
                        uniqueNums = true;
                        break;
                    }
                }

                if(!uniqueNums) {
                    intArr[i] = number;
                    break;
                }
            }
        }
        count = 0;
        for(int j = 0; j < length; j++) {
            count++;
            if(count == 11) {
                System.out.println();
                count = 1;
            }
            Arrays.sort(intArr);
            System.out.printf("%4s ", intArr[j]);
        }

        System.out.println("\n\nЗадание№6: Сдвиг элементов массива.");
        String[] stringsArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        length = stringsArray.length;
        count = 0;
        for(String s : stringsArray) {
            if(!s.isBlank()) {
                count++;
            }
        }
        String[] stringsArrayCopy = new String[count];
        int numberCopy = stringsArrayCopy.length;
        count = 0;
        for (int i = 0; i < stringsArrayCopy.length; i++) {
            for (int j = 0; j < length; j++) {
                j = count;
                if(!stringsArray[j].isBlank()) {
                    System.arraycopy(stringsArray, j, stringsArrayCopy, i, numberCopy);
                    numberCopy--;
                    count++;
                    break;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(stringsArray));
        System.out.println(Arrays.toString(stringsArrayCopy));
    }


    private static void printArr(int[] nums) {
        for (int num : nums) {
            System.out.println(Arrays.toString(nums) + " ");
        }
        System.out.println();
    }
}



